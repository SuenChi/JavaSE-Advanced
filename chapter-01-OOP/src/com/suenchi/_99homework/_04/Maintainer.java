package com.suenchi._99homework._04;

public class Maintainer extends AdminStaff{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的"+getName()+"在解决不能共享屏幕问题");
    }

    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
}
