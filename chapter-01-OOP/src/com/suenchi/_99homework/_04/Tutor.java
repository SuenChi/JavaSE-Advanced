package com.suenchi._99homework._04;

public class Tutor extends Teacher{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的"+getName()+"在帮助学生解决问题");
    }

    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }
}
