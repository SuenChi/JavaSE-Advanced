package com.suenchi._02ByteStream._01FileInputStream;

import java.io.File;
import java.io.FileInputStream;

/**FileInputStream成员方法
 * (1)int read()
 * (2)int read(byte[] buffer)
 * (3)byte[] readAllBytes()
 * (4)void close()
 */

/**
 * 使用字节流读取中文，如何保证输出不乱码？
 *      1. 方法一：定义一个与文件一样大的字节数组，然后调用`int read(byte[] buffer)`；
 *      2. 方法二：直接调用`byte[] readAllBytes()`；
 */

public class Demo2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream(new File("chapter-09-File_IO/test.txt"));

        /**(1)int read()
         *      读取一个字节返回，若发现没有数据可读将返回-1；
         *      （即一次读取一个字节）
         * 一次读取一个字节存在什么问题？
         *      1. 读取性能较差
         *      2. 读取汉字输出会乱码
         */
        System.out.println("(1)------------------------------------------------------------");
        int i;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println();

        /**(2)int read(byte[] buffer)
         *      用一个字节数组接收读取到的数据，返回值为该数组读取了多少个字节，若发现没有数据可读将返回-1；
         *      （即一次读取多个字节）
         * 一次读取多个字节有什么好处？ 存在什么问题？
         *      1. 读取的性能得到了提升
         *      2. 读取中文字符并输出仍然存在乱码问题
         */
        System.out.println("(2)------------------------------------------------------------");
        fis=new FileInputStream(new File("chapter-09-File_IO/test.txt"));   //从头开始读取
        byte[] bytes=new byte[5];
        while((i=fis.read(bytes))!=-1){
            /**String(byte[] bytes, int off, int len)
             *      通过使用平台的默认字符集解码指定的字节数组来构造新的String
             *      解码bytes数组, 从off索引开始, 解析len个字节
             */
            System.out.print(new String(bytes,0,i));
        }
        System.out.println();

        /**(3)byte[] readAllBytes()
         *      直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回；
         *      （即一次读取完全部字节）
         * 一次读取完全部字节存在什么问题？
         *      如果文件过大，创建的字节数组也会过大，可能引起内存溢出
         */
        System.out.println("(3)------------------------------------------------------------");
        fis=new FileInputStream(new File("chapter-09-File_IO/test.txt"));   //从头开始读取
        byte[] allBytes = fis.readAllBytes();
        System.out.println(new String(allBytes));

        /**(4)void close()
         *      关闭文件字节输入流，并释放与该流关联的所有系统资源；
         */
        fis.close();


    }
}
