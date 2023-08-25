package com.itheima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ListDemo2
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class ListDemo2 {
    public static void main(String[] args) {
        //直接创建ArrayList集合类对象(不需要多态)
        ArrayList<String> strList = new ArrayList<>();
        strList.add("张二狗");
        strList.add("李狗蛋");
        strList.add("刘铁柱");

        //遍历方式(1)-迭代器
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println("迭代器 : " + element);
        }

        //遍历方式(2)-增强For
        for (String element : strList) {
            System.out.println("增强For : " + element);
        }

        //遍历方式(3)-Lambda表达式
        strList.forEach(element -> System.out.println("Lambda : " + element));

        //遍历方式(4)-普通for循环(基于get方法)
        for (int i = 0; i < strList.size(); i++) {
            String element = strList.get(i);
            System.out.println("普通for : " + element);
        }
    }
}
