package com.suenchi._02StringJoiner;
import java.util.StringJoiner;
//创建StringJoiner对象
public class Demo1 {
    public static void main(String[] args) {
        /**
         * public StringJoiner(CharSequence delimiter) :
         *      创建StringJoiner对象,并指定元素间隔符号
         */
        StringJoiner str1=new StringJoiner(",");
        /**
         * public StringJoiner(CharSequence delimiter, CharSequence prefix,CharSequence suffix) :
         *      定义StringJoiner对象,并指定元素间隔符,拼接前缀,拼接后缀
         */
        StringJoiner str2=new StringJoiner(",","[","]");
    }
}
