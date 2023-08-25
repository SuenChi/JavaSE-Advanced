package com.suenchi._99homework._04;

public class Lecturer extends Teacher{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的"+getName()+"在讲课");
    }

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
}