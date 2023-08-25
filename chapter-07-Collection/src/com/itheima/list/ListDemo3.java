package com.itheima.list;

import java.util.LinkedList;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ListDemo3
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        //LinkedList特有的操作头尾结点-添加
        numberList.addFirst(1); //比add(0,1)效率要高!
        numberList.addLast(5); //比add(5)效率要高!
        System.out.println("add : " + numberList);

        //LinkedList特有的操作头尾结点-获取
        System.out.println("get : " + numberList.getFirst()); //比get(0)效率要高
        System.out.println("get : " + numberList.getLast()); //比get(长度-1)效率要高

        //▲LinkedList的特有的操作头尾结点-删除
        Integer firstRemoveElement = numberList.removeFirst();
        Integer lastRemoveElement = numberList.removeLast();
        System.out.println("remove : " + firstRemoveElement + " remove : " + lastRemoveElement);
        System.out.println("remove : " + numberList);
    }
}
