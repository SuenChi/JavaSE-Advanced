package com.suenchi._02StringJoiner;
import java.util.StringJoiner;

/**利用StringJoiner将数组中的元素拼接成[x,x,x,...]的形式,并返回该字符串
 * 注意 : StringJoiner对象拼接的内容不能是任意的类型,必须为CharSequence类型及其子类;
 */

public class Demo3 {
    public static void main(String[] args) {
        int[] arr={213,321,34,23,32,12,12,3,213,213,12,321,33,21,132};
        System.out.println(func2(arr));
    }

    public static String func2(int[] arr){

        StringJoiner str=new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            //*必须要转换成字符串
            str.add(String.valueOf(arr[i]));
        }
        return str.toString();
    }
}