package com.suenchi._01StringBuilder;
/**
 * 1.StringBuilder类无参构造
 * 2.StringBuilder类有参构造
 *
 */

public class Demo1 {
    public static void main(String[] args) {
        /**
         * public StringBuilder()
         *      无参构造
         */
        StringBuilder stringBuilder1=new StringBuilder();
        System.out.println("stringBuilder1 = " + stringBuilder1);
        /**
         * public StringBuilder(CharSequence seq)
         *      有参构造
         */
        StringBuilder stringBuilder2=new StringBuilder("suenchi");
        System.out.println("stringBuilder2 = " + stringBuilder2);
    }
}
