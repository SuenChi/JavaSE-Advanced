package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * PROJECT_NAME: advanced-415
 * NAME: CollectionDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        //Collections是工具类里面的静态方法
        ArrayList<String> strList = new ArrayList<>();

        //public static <T> boolean addAll(Collection<T> c,T... elements) : 向参数一的单列集合中添加多个元素
        Collections.addAll(strList, "张二狗", "李狗蛋", "刘铁柱");
        System.out.println("strList : " + strList);

        //public static void shuffle(List<?> list) : 打乱参数集合的元素顺序(随机性 每次打乱结果都不一样)
        Collections.shuffle(strList);
        System.out.println("shuffle : " + strList);
    }
}
