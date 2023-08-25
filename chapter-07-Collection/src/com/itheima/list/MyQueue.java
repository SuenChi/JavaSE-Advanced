package com.itheima.list;

import java.util.LinkedList;

/**
 * 基于链表模拟队列结构的特性
 * PROJECT_NAME: advanced-415
 * NAME: MyQueue
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class MyQueue<E> {
    //基于维护一个LinkedList来保存数据
    private LinkedList<E> dataList = new LinkedList<>();
    //对外提供功能-1:存数据的功能
    public void add(E e) { dataList.addLast(e); }
    //对外提供功能-2:取数据的功能(满足队列的特性)
    public E get() { return dataList.removeFirst();} //删除头结点并将头结点数据返回 }
}
