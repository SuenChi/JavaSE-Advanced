package com.suenchi._01List;

import java.util.LinkedList;
//利用LinkedList模拟栈
public class Demo3 {
    public static void main(String[] args) {
        MyStack<String> myStack =new MyStack<>();
        myStack.add("suenchi");
        myStack.add("sunqi");
        myStack.add("cassius");
        myStack.add("cooper");
        myStack.add("copper");
        myStack.add("christopher");
        System.out.println("myStack = " + myStack);
        System.out.println("出栈 : "+myStack.get());
        System.out.println("出栈 : "+myStack.get());
        System.out.println("出栈 : "+myStack.get());
        System.out.println("myStack = " + myStack);

    }
    public static class MyStack<E>{
        private LinkedList<E> dataList=new LinkedList<>();

        //添加数据
        public void add(E e){dataList.add(e);}

        //删除尾结点, 并返回
        public E get(){return dataList.removeLast();}

        @Override
        public String toString() {
            return "MyStack{" +
                    "dataList=" + dataList +
                    '}';
        }
    }
}

