package com.suenchi._02Genericity;

/**
 * 1.如何定义泛型方法
 * 2.如何调用泛型方法
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 如何调用泛型方法:
         *      调用泛型方法时, 不需要手动声明
         */
        Integer[] arr = new Integer[5];
        Integer elem = 20;
        addElement(arr, 0, elem);
    }

    /**
     * 如何定义泛型方法
     *      方法功能 : 将指定类型的数据添加到arr数组的index索引中
     */
    public static <T> void addElement(T[] arr, int index, T data) {
        arr[index] = data;
    }
}
