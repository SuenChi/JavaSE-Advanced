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
public class MethodReferenceDemo2 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("张二狗", 23, 100);
        studentArray[1] = new Student("刘铁柱", 24, 87);
        studentArray[2] = new Student("李狗蛋", 21, 68);
        studentArray[3] = new Student("王小花", 20, 92);
        studentArray[4] = new Student("张美丽", 22, 5);

        Student stu = new Student();

        //Lambda
        Arrays.sort(studentArray, (o1, o2) -> stu.compareStudent(o1, o2));

        //前提:当Lambda表达式中只是用对象调用了一个实例方法,并且将形参o1和o2传递到实例方法中作为实参(必须完全一致)
        //格式: 对象名::方法名
        Arrays.sort(studentArray, stu::compareStudent);
    }
}
