package com.suenchi._01Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        Student[] stuArr = new Student[5];
        stuArr[0] = new Student("张二狗", 101, 17);
        stuArr[1] = new Student("刘铁柱", 102, 23);
        stuArr[2] = new Student("李狗蛋", 104, 21);
        stuArr[3] = new Student("王小花", 110, 12);
        stuArr[4] = new Student("张美丽", 107, 14);

        /**
         * public static void sort(T[], Comparator<T> c)
         *      将要排序的数组作为第一个参数传递,第二个参数基于匿名内部类快速创建接口实现类
         */
        Arrays.sort(stuArr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                /**
                 * 前 - 后 : 升序
                 * 后 - 前 : 降序
                 */
//                return o1.getId() - o2.getId();
//                return o1.getAge()-o2.getAge();
                return o2.getAge() - o1.getAge();
            }
        });
        for (int i = 0; i < stuArr.length; i++) {
            System.out.println((i + 1) + " = " + stuArr[i].toString());
        }
    }
}
