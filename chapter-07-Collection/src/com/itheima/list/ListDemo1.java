package com.itheima.list;

import java.util.ArrayList;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ListDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class ListDemo1 {
    public static void main(String[] args) {
        //直接创建ArrayList集合类对象(不需要多态)
        ArrayList<String> strList = new ArrayList<>();
        strList.add("张二狗");
        strList.add("李狗蛋");
        strList.add("刘铁柱");

        //public void add(int index,E e) : 添加元素到指定索引(原有内容向后挪动一位)
        //int index参数的范围:0到集合长度合法 不满足要求非法(注意索引越界问题)
        strList.add(1, "王小花");//在李狗蛋前面添加王小花
        System.out.println("add : " + strList);

        //public E remove(int index) : 删除指定索引的元素(原有内容向前挪动一位)
        //int index参数的范围:0到集合长度-1 (注意索引越界问题)
        String removeElement = strList.remove(0);//删除张二狗
        System.out.println("removeElement : " + removeElement);
        System.out.println("remove : " + strList);

        //public E set(int index,E e) : 将指定索引的元素替换为参数,并返回被替换的元素
        //int index参数的范围:0到集合长度-1 (注意索引越界问题)
        String replaceElement = strList.set(0, "张美丽");//将王小花替换为张美丽
        System.out.println("replaceElement : " + replaceElement);
        System.out.println("set : " + strList);

        //public E get(int index) : 获取指定索引的元素
        //int index参数的范围:0到集合长度-1 (注意索引越界问题)
        System.out.println("0索引元素是 : " + strList.get(0));
        System.out.println("1索引元素是 : " + strList.get(1));
        System.out.println("2索引元素是 : " + strList.get(2));
    }
}
