package com.suenchi._99homework._code_02;

/**
 * 题目描述:
 * 我们电脑上都有USB接口,当我们的鼠标和键盘插上去之后才可以使用,拔出来就关闭使用.
 * 其实具体是什么USB设备，笔记本并不关心，只要符合USB规格的设备都可以。
 * 鼠标和键盘要想能在电脑上使用，那么鼠标和键盘也必须遵守USB规范，不然鼠标和键盘的生产出来无法使用;
 * 根据描述设计程序,完成键盘和鼠标插在电脑上就开启,拔出来就关闭的需求.
 *
 * 训练提示:
 * 1.定义USB接口,鼠标类和键盘类都可以作为实现类去实现USB接口
 * 2.但是定义实现类,重写方法很麻烦,可以使用匿名内部类完成
 *
 * 参考方案:
 * 1.定义USB接口,鼠标类和键盘类都可以作为实现类去实现USB接口
 * 2.定义电脑类,在电脑类中定义一个useUSB方法,方法参数为USB接口类型
 * 3.调用useUSB方法,参数可以直接使用匿名内部类的形式传递实现类类型
 */
public class Demo {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.start();
        //键盘插入电脑
        laptop.useUSB(new USB() {
            @Override
            public void open() {
                System.out.println("键盘USB插入电脑");
            }

            @Override
            public void close() {
                System.out.println("键盘USB拔出电脑");
            }
        });

        //鼠标插入电脑
        laptop.useUSB(new USB() {
            @Override
            public void open() {
                System.out.println("鼠标USB插入电脑");
            }

            @Override
            public void close() {
                System.out.println("鼠标USB拔出电脑");
            }
        });

        laptop.stop();
    }
}