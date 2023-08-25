package com.suenchi._01File;

import java.io.File;
import java.io.IOException;

/**案例: 如何保证一定成功创建File对应的文件?
 * 1.获取该File对象的父路径
 * 2.创建父路径对应的文件夹
 * 3.再创建文件
 */
public class Exam2 {
    public static void main(String[] args) throws IOException {
        File file=new File("chapter-09-File_IO/a2/b2/c2/null2.txt");
        System.out.println("file.getParentFile().mkdirs() = " + file.getParentFile().mkdirs());
        System.out.println("file.createNewFile() = " + file.createNewFile());
    }
}
