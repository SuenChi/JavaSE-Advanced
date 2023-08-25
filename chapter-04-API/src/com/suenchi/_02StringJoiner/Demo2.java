package com.suenchi._02StringJoiner;
import java.util.StringJoiner;

/**
 * 1.创建StringJoiner对象
 * 2.StringJoiner对象拼接内容
 * 3.返回StringJoiner对象长度
 * 4.将StringJoiner容器内容转换为字符串对象
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * public StringJoiner(CharSequence delimiter, CharSequence prefix,CharSequence suffix) :
         *      定义StringJoiner对象,并指定元素间隔符,拼接前缀,拼接后缀
         */
        StringJoiner str=new StringJoiner(",","[","]");

        /**
         * public StringJoiner add(CharSequence elem) :
         *      拼接内容
         */
        str.add("10").add("suenchi").add("seer");   //不能像StringBuilder一样拼接任何内容
        System.out.println("str = " + str);

        /**
         * public int length() :
         *      获取字符个数
         */
        System.out.println(str.length());

        /**
         * public String toString() :
         *      将StringJoiner容器内容转换为字符串对象
         */
        System.out.println(str.toString());
    }
}
