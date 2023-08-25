package com.itheima.list;

import java.util.LinkedList;

/**
 * PROJECT_NAME: advanced-415
 * NAME: MyStack
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class MyStack<E> {
    //基于维护一个LinkedList来保存数据
    private LinkedList<E> dataList = new LinkedList<>();
    //对外提供功能-1:存数据的功能
    public void add(E e) { dataList.addLast(e); }
    //对外提供功能-2:取数据的功能(满足栈的特性)
    public E get() { return dataList.removeLast(); }//删除尾结点并返回
}
