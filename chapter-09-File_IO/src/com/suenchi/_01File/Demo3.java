package com.suenchi._01File;

import java.io.File;
import java.io.IOException;

/**File类创建/删除文件/文件夹
 * 1.创建文件
 * 2.创建文件夹
 * 3.删除文件/文件夹
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //封装File对象(并不存在对应路径的文件/文件夹)
        File file1=new File("chapter-09-File_IO/null1.txt");
        File file2=new File("chapter-09-File_IO/a1/b1/c1");

        /**(1)boolean createNewFile()
         *      创建一个新的空的文件，若父路径不存在会抛出异常；
         *      若文件不存在, 则创建成功, 并返回true
         *      若文件已经存在, 则创建失败, 并返回false
         */
        System.out.println("file1.createNewFile() = " + file1.createNewFile());

        /**(2)boolean mkdirs()
         *      创建一级/多级文件夹
         *      若该一级/多级文件夹不存在, 则创建成功, 并返回true
         *      若该一级/多级文件夹已经存在, 则创建失败, 并返回false
         * 一级文件：打开文件夹后能直接看到的文件/文件夹；
         */
        System.out.println("file2.mkdirs() = " + file2.mkdirs());

        /**(3)boolean delete()
         *      删除文件/空文件夹，删完不会放到回收站，而是直接删除；
         *      删除成功返回true
         */
        /*System.out.println("file1.delete() = " + file1.delete());
        System.out.println("file2.delete() = " + file2.delete());*/
    }
}
