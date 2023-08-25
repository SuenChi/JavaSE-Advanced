package com.suenchi._99homework._code_01;

public class Student {
    private String id;
    private String name;
    private static String classroom;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getClassroom() {
        return classroom;
    }

    public static void setClassroom(String classroom) {
        Student.classroom = classroom;
    }
}
