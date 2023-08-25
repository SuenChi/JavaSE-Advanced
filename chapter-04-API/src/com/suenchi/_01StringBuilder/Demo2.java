package com.suenchi._01StringBuilder;

/**
 * (1)▲public StringBuilder append(任意内容) : 拼接内容到容器中并返回调用者对象
 * (2)public StringBuilder reverse() : 翻转容器内容 "ab我c" => "c我ba"
 * (3)public int length() : 获取容器中字符个数
 * (4)public String toString() : 将StringBuilder容器的内容转换为字符串对象
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.public StringBuilder append(任意类型),返回的对象就是该对象本身;(你可以返回,也可以不返回)
        StringBuilder stringBuilder1=new StringBuilder("suenchi");
        StringBuilder stringBuilder2 = stringBuilder1.append(true);     //stringBuilder1和stringBuilder2引用指向同一个StringBuilder对象
        stringBuilder1.append(13.14);
        System.out.println("stringBuilder1 = " + stringBuilder1);   //拼接会改变对象本身的值
        System.out.println("stringBuilder2 = " + stringBuilder2);   //同时将该对象本身的引用返回

        //2.public StringBuilder reverse()
        stringBuilder1.reverse();
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //3.public int length()
        System.out.println(stringBuilder1.length());

        //4.public String toString():虽然打印效果一样,但一个是StringBuilder对象,一个是String对象
        System.out.println(stringBuilder1.toString());
    }
}