package com.suenchi._01inner_class;

/**
 * PROJECT_NAME: advanced-415
 * NAME: Student
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/15
 */
public class Student {
    private String name;
    private String gender;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
