package com.suenchi._01Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/**HashMap对象的创建与遍历
 * LinkedHashMap对象的创建与遍历
 */
public class Demo3 {
    public static void main(String[] args) {
        //(1)创建HashMap对象
        //★存入取出无序
        System.out.println("(1)-------------------------------------------------------------");
        HashMap<Student, String> studentMap1 = new HashMap<>();
        studentMap1.put(new Student("张二狗", 23), "北京");
        studentMap1.put(new Student("张二狗", 23), "上海");   //键重复, 起到修改的作用
        studentMap1.put(new Student("刘铁柱", 23), "重庆");
        studentMap1.put(new Student("李狗蛋", 23), "天津");
        //遍历
        studentMap1.forEach((key, value) -> System.out.println("籍贯是" + value + "的学生信息:" + key));

        //(2)创建LinkedHashMap对象
        //★存入取出有序
        System.out.println("(2)-------------------------------------------------------------");
        LinkedHashMap<Student, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(new Student("张二狗", 23), "北京");
        studentMap2.put(new Student("张二狗", 23), "上海");   //键重复, 起到修改的作用
        studentMap2.put(new Student("刘铁柱", 23), "重庆");
        studentMap2.put(new Student("李狗蛋", 23), "天津");
        //遍历
        studentMap2.forEach((key, value) -> System.out.println("籍贯是" + value + "的学生信息:" + key));
    }

    public static class Student {
        private String name;
        private Integer age;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Student() {
        }

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
