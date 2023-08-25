package com.suenchi._01StringBuilder;
//案例:利用StringJoiner将数组中的元素拼接成[x,x,x,...]的形式,并返回该字符串
public class Demo4 {
    public static void main(String[] args) {
        int[] arr={1,2,23,3,4,5,5,432,2,32};
        System.out.println(func(arr));
    }

    public static String func(int[] arr){
        StringBuilder str=new StringBuilder("[");
        for (int i = 0; i < arr.length-1; i++) {
//            str.append(arr[i]+",");   //多个字符拼接建议使用多个append
            str.append(arr[i]).append(",");
        }
        str.append(arr[arr.length - 1]).append("]");
        return str.toString();
    }
}
