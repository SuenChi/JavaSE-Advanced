package com.suenchi._01List;

import java.util.ArrayList;
import java.util.Iterator;
//List集合的四种遍历方式
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");

        //1.迭代器
        Iterator<String> it = arrayList.iterator();
        while(it.hasNext()){
            String elem=it.next();
            System.out.println("elem = " + elem);
        }

        //2.增强for
        for (String s : arrayList) {
            System.out.println("s = " + s);
        }

        //3.Lambda表达式(forEach)
        arrayList.forEach(elem-> System.out.println("elem = " + elem));

        //4.普通for循环
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
