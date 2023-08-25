package com.suenchi._99homework._02;

public class Test {
    public static void main(String[] args) {
        NewPhone newPhone=new NewPhone();
        newPhone.setBrand("苹果");
        newPhone.setPrice(7899);
        System.out.println("手机型号为"+newPhone.getBrand()+", 价格为"+newPhone.getPrice());
        newPhone.call("库克");
        newPhone.sendMessage();
        newPhone.callerID();
    }
}
