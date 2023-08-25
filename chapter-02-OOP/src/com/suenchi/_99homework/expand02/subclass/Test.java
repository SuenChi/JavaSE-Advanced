package com.suenchi._99homework.expand02.subclass;

import com.suenchi._99homework.expand02.template.House;

public class Test {
    public static void main(String[] args) {
        House house=new House01("刘的房子");
        house.construct();

        house=new House02("刘的房子");
        house.construct();
    }
}