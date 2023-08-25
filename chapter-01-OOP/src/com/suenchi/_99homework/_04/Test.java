package com.suenchi._99homework._04;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer("666","乔峰");
        Tutor tutor=new Tutor("668","段誉");
        Maintainer maintainer=new Maintainer("686","柳岩");
        Buyer buyer=new Buyer("888","景甜");
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();
    }
}