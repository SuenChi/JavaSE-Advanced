package com.itheima.method.reference;

import com.itheima.entity.Student;

import java.util.Arrays;

/**
 * PROJECT_NAME: advanced-415
 * NAME: MethodReference
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class MethodReferenceDemo4 {
    public static void main(String[] args) {
        //使用前提:如果Lambda表达式中只有创建对象的内容,并且Lambda所实现的方法形参全部传递到构造方法中作为实参
        function(new Create() {
            @Override
            public Student createStudent() {
                return new Student();
            }
        });

        //格式: 类名::new
        function(Student::new);
    }

    public static void function(Create create) {
        Student student = create.createStudent();
    }
}
