package com.suenchi._01File;

import java.io.File;
import java.io.IOException;

/**
 * File构造方式
 * 1.根据绝对路径创建文件对象
 * 2.根据相对路径创建文件对象
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /**绝对路径 与 相对路径
         * 1.绝对路径
         *      从盘符开始的路径
         *      格式:
         *              盘符:\\文件夹名\\文件名
         *      或:
         *              盘符:/文件夹名/文件名
         * 2.相对路径
         *      从当前模块开始的路径
         *      格式:
         *              模块名\\文件夹名\\文件名
         *      或:
         *              模块名/文件夹名/文件名
         */

        //(1)File(String pathname): 根据绝对路径, 创建文件对象
        File f1 = new File("C:\\Users\\Cooper\\Documents\\window常用操作\\磁盘清理.png");

        //(2)File(String pathname): 根据绝对路径, 创建文件夹对象
        File f2 = new File("C:\\Users\\Cooper\\Documents\\window常用操作");

        //(3)File(String parent, String child): 根据父路径和子路径创建文件对象/文件夹对象
        File f3 = new File("C:\\Users\\Cooper\\Documents\\window常用操作", "磁盘清理.png");

        //(4)File(File parent, String child): 根据父路径对应的文件对象和子路径创建文件对象/文件夹对象
        File f4 = new File(f2, "磁盘清理.png");    //作用同f3

        //(5)File(String pathname): 根据相对路径, 创建文件对象
        File f5 = new File("chapter-09-File_IO/磁盘清理.png");
    }
}