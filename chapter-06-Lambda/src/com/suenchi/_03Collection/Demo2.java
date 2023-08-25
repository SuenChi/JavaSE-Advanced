package com.suenchi._03Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 1.如何遍历集合元素
 *      (1)利用迭代器Iterator
 *      (2)利用增强for循环
 *      (3)利用forEach方法
 *
 *
 * 2.如何利用迭代器对象删除集合中的元素
 *      default void remove()
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> strCol = new ArrayList<>();
        strCol.add("张三本");
        strCol.add("李四");
        strCol.add("王五至");
        strCol.add("赵六偶");
//        func1(strCol);
//        func2(strCol);
        func3(strCol);


    }

    /**
     * (1)利用迭代器
     * Collection类的方法:
     *      public Iterator<E> iterator()
     *              获取迭代器对象
     * Iterator类的方法:
     *      public boolean hasNext()
     *              判断当前迭代器所指元素是否为空
     *              returns true if next() would return an element rather than throwing an exception
     *      public E next()
     *              获取迭代器所指元素, 并使迭代器指向下一个元素
     */
    public static void func1(Collection<String> strCol){
        Iterator<String> it= strCol.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println("本次遍历的元素为 : "+str);
        }
    }

    /**
     * 利用迭代器对象删除集合中元素
     * 删除名字小于3个字的人
     */
    public static void func2(Collection<String> strCol){
        Iterator<String> it=strCol.iterator();
        while(it.hasNext()){
            String str=it.next();
            if(str.length()<3){

                //strCol.remove(str);   //不允许在迭代过程中使用集合对象调用删除方法删元素, 如果真的想要删除,可以基于迭代器提供的删除方法进行删除
                /**
                 * default void remove()
                 *      删除迭代器最后返回的一个元素
                 */
                it.remove();
            }
        }
        System.out.println("删除完名字小于3个字的人后,集合中的元素为 : "+ strCol);
    }

    /**
     * (2)利用增强for循环遍历集合
     * @param strCol
     */
    public static void func3(Collection<String> strCol){
        for (String s : strCol) {
            System.out.println("本次遍历的元素为 : "+s);
        }
    }

    /**
     * (3)利用forEach方法
     *      default void forEach(Consumer c)
     *              属于Collection接口中的方法
     *              传递元素消费逻辑, 完成集合遍历
     */
    public static void func4(Collection<String> strCol){
        //1.匿名内部类写法
        strCol.forEach(new Consumer<String>() {     //将集合中每个元素传递到accept的形参s中
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //2.lambda表达式写法
        strCol.forEach(s -> System.out.println(s));
        //3.方法引用写法
        strCol.forEach(System.out::println);
    }
}
