package com.itheima.parameter;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ParameterDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class ParameterDemo1 {
    public static void main(String[] args) {
        //调用function方法的时候会明确方法的形式参数是一个可变参数
        //可变参数传递实参的方式-1:不传递
        function(); //本质:int... a 相当于 new int[0];

        //可变参数传递实参的方式-2:传递单个数据[直接编写]/多个数据[使用,隔开]
        function(10); //本质:int... a 相当于 new int[]{10};

        function(10, 20, 30, 40); //本质:int... a 相当于 new int[]{10,20,30,40};

        //可变参数传递实参的方式-3:传递null ▲不要传递null
        //function(null); //本质: int... a 相当于 int[] a = null;

        //可变参数传递实参的方式-4:传递数组
        int[] arr = new int[]{11, 22, 33};
        function(arr); //本质: int... a 相当于 int[] a = arr;
    }

    //可变参数:(数据类型... 变量名)
    public static void function(int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}
//varargs
