package com.suenchi._99homework._01;

//每一款手机都有自己的品牌和价格
//原来的手机只能打电话,发短信
public class OldPhone {
    private String brand;
    private double price;

    public void call(String toPerson){
        System.out.println("使用价格为"+price+"的"+brand+"手机向"+toPerson+"打了一个电话");

    }

    public void sendMessage(String toPerson){
        System.out.println("使用价格为"+price+"的"+brand+"手机向"+toPerson+"发了一个短信");

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