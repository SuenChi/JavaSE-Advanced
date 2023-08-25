package com.suenchi._01Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**案例:
 * 集合hashMap保存省与市之间的一一对应的关系
 *      省份作为键
 *      值为一个集合cityList, 保存该省份下设的城市
 * 知识点 : 集合的嵌套
 */
public class Exam2 {
    public static void main(String[] args) {
        //创建cityList集合
        ArrayList<String> cityList1=new ArrayList<>();
        Collections.addAll(cityList1,"武汉市,孝感市,十堰市,宜昌市,鄂州市".split(","));
        ArrayList<String> cityList2=new ArrayList<>();
        Collections.addAll(cityList2,"南京市,扬州市,苏州市,无锡市,常州市".split(","));
        ArrayList<String> cityList3=new ArrayList<>();
        Collections.addAll(cityList3,"石家庄市,唐山市,邢台市,保定市,邯郸市".split(","));

        //创建嵌套的集合
        HashMap<String,ArrayList<String>> hashMap=new HashMap<>();
        hashMap.put("湖北省",cityList1);
        hashMap.put("江苏省",cityList2);
        hashMap.put("河北省",cityList3);

        //遍历嵌套的集合
        hashMap.forEach((key, value) -> {
            System.out.print(key+"下设城市 : ");
            value.forEach(s -> System.out.print(s+" "));
            System.out.println();
        });
    }
}