package com.itheima.method.reference;

import com.itheima.entity.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * PROJECT_NAME: advanced-415
 * NAME: MethodReference
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class MethodReferenceDemo3 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("张二狗", 23, 100);
        studentArray[1] = new Student("刘铁柱", 24, 87);
        studentArray[2] = new Student("李狗蛋", 21, 68);
        studentArray[3] = new Student("王小花", 20, 92);
        studentArray[4] = new Student("张美丽", 22, 5);

        //使用前提:如果Lambda表达式只是调用一个实例方法,并且所实现方法的第一个参数就是实例方法的调用者,剩余的所有参数作为实例方法的实参传递
        Arrays.sort(studentArray, (o1, o2) -> o1.iCompareStudent(o2));

        //格式: 类名::实例方法名
        Arrays.sort(studentArray, Student::iCompareStudent);

    }
}
