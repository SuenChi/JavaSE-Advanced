package com.suenchi._99homework._04;

public class Buyer extends AdminStaff{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的"+getName()+"在采购音响设备");
    }

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }
}
