package com.itheima.entity;

public class Student {
    private String name;
    private Integer age;
    private Integer score;

    //声明一个静态方法(用于声明两个学生对象比较的方式并且最终返回一个int值)
    public static int sCompareStudent(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

    //声明一个成员方法(用于声明两个学生对象比较的方式并且最终返回一个int值)
    public int compareStudent(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

    //声明一个方法(用于声明当前调用者对象与学生对象比较的方式并最终返回一个int值)
    public int iCompareStudent(Student o1) {
        return this.getAge() - o1.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        return score != null ? score.equals(student.score) : student.score == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Integer age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
