package com.suenchi._99homework._02;
//品牌和价格
//打电话,发短信,来电显示手机号
public class OldPhone {
    private String brand;
    private double price;

    public void call(String toPerson){
        System.out.println("给"+toPerson+"打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void callerID(){
        System.out.println("显示来电手机号");
    }

    public OldPhone() {
    }

    public OldPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
