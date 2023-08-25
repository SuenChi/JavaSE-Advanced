package com.suenchi._01List;

import java.util.LinkedList;

//利用LinkedList模拟队列
public class Demo4 {
    public static void main(String[] args) {
        MyQueue<String> myQueue=new MyQueue<>();
        myQueue.add("suenchi");
        myQueue.add("sunqi");
        myQueue.add("cassius");
        myQueue.add("cooper");
        myQueue.add("copper");
        myQueue.add("christopher");
        System.out.println("myQueue = " + myQueue);
        System.out.println("出队 : "+myQueue.get());
        System.out.println("出队 : "+myQueue.get());
        System.out.println("出队 : "+myQueue.get());
        System.out.println("myQueue = " + myQueue);
    }
    public static class MyQueue<E>{
        private LinkedList<E> dataList=new LinkedList<>();

        //入队
        public void add(E e){ dataList.addLast(e); }

        //出队并返回该元素
        public E get(){return dataList.removeFirst();}

        @Override
        public String toString() {
            return "MyQueue{" +
                    "dataList=" + dataList +
                    '}';
        }
    }
}

