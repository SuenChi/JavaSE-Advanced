package com.suenchi._01Properties;

import java.io.*;
import java.util.Properties;

/**案例:
 * 判断stu.properties中是否包含键"王美丽", 若不包含则添加 "张美丽=21" 到其中
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();

        pro.load(new FileReader("chapter-11-Properties_XML_Logback/src/com/suenchi/_01Properties/stu.properties"));


        if (!pro.contains("王美丽")) {
            pro.setProperty("王美丽","21");
            System.out.println("stu.properties中不包含王美丽, 现已添加\"王美丽=21\"到stu.properties中");
        }

        pro.store(new FileWriter("chapter-11-Properties_XML_Logback/src/com/suenchi/_01Properties/stu.properties"),null);
    }
}