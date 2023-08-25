package com.suenchi._02ByteStream._01FileInputStream;

import java.io.File;
import java.io.FileInputStream;

/**FileInputStream构造方法
 * 1.基于File对象创建
 * 2.基于文件路径创建
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        /**(1)FileInputStream(File file)
         *      基于File对象创建
         *
         */
        FileInputStream fis1=new FileInputStream(new File("chapter-09-File_IO/null1.txt"));
        System.out.println("fis1 = " + fis1);


        /**(2)FileInputStream(String pathname)
         *      基于文件路径创建
         */
        FileInputStream fis2=new FileInputStream("chapter-09-File_IO/null1.txt");
        System.out.println("fis2 = " + fis2);

        /**注意
         * 1.传递的File/String一定要指向一个存在的文件(不能是文件夹/不能是不存在的内容)
         * 2.如果读取的路径不存在:java.io.FileNotFoundException: chapter-09-io\b.txt (系统找不到指定的文件。)
         * 3.如果读取的是文件夹:java.io.FileNotFoundException: chapter-09-io\a (拒绝访问。)
         */
        fis1.close();
        fis2.close();
    }
}
