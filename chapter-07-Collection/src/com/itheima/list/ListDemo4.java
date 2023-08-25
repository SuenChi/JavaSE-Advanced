package com.itheima.list;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ListDemo4
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class ListDemo4 {
    public static void main(String[] args) {
        //创建自定义的队列集合
        MyQueue<Integer> numberQueue = new MyQueue<>();
        numberQueue.add(10);
        numberQueue.add(20);
        numberQueue.add(30);
        //获取3次(观察是不是按照10,20,30顺序获取到的)
        System.out.println(numberQueue.get());
        System.out.println(numberQueue.get());
        System.out.println(numberQueue.get());

        //创建自定义的栈集合
        MyStack<Integer> numberStack = new MyStack<>();
        numberStack.add(11);
        numberStack.add(22);
        numberStack.add(33);
        //获取3次(观察是不是按照33,22,11顺序获取到的)
        System.out.println(numberStack.get());
        System.out.println(numberStack.get());
        System.out.println(numberStack.get());
    }
}
