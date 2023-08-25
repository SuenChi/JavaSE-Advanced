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
public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("张二狗", 23, 100);
        studentArray[1] = new Student("刘铁柱", 24, 87);
        studentArray[2] = new Student("李狗蛋", 21, 68);
        studentArray[3] = new Student("王小花", 20, 92);
        studentArray[4] = new Student("张美丽", 22, 5);

        //基于Arrays.sort完成学生的排序(Lambda表达式)
        //Arrays.sort(studentArray, (o1, o2) -> o1.getAge() - o2.getAge());

        //前提:Lambda表达式中只用了Student类调用了sCompareStudent,并且将形参o1和o2传递到静态方法中作为实参(必须完全一致)
        //静态方法引用 类名::静态方法名
        //Arrays.sort(studentArray, (o1, o2) -> Student.sCompareStudent(o1, o2));
        Arrays.sort(studentArray, Student::sCompareStudent);


        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }
    }
}
