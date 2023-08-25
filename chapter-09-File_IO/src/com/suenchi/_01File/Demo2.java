package com.suenchi._01File;

import java.io.File;
import java.util.Date;

/**
 * 1.File类判断文件类型的方法
 * 2.File类获取文件信息的方法
 */
public class Demo2 {
    public static void main(String[] args) {
        File file=new File("chapter-09-File_IO/磁盘清理.png");

        /**(1)boolean exists()
         *      判断当前文件对象，对应的文件路径是否存在，存在返回true
         * 注意: 创建File对象时, 若文件路径不存在, 系统不会报错;
         */
        System.out.println("file.exists() = " + file.exists());

        /**(2)boolean isFile()
         *      判断当前文件对象指代的是否是文件，是文件返回true
         */
        System.out.println("file.isFile() = " + file.isFile());

        /**(3)boolean isDirectory()
         *      判断当前文件对象指代的是否是文件夹，是文件夹返回true
         */
        System.out.println("file.isDirectory() = " + file.isDirectory());

        /**(4)String getName()
         *      获取文件的名称（包含后缀）
         */
        System.out.println("file.getName() = " + file.getName());

        /**(5)long length()
         *      获取文件的大小，返回字节个数
         */
        System.out.println("file.length() = " + file.length());

        /**(6)long lastModified()
         *      获取文件的最后修改时间, 返回时间毫秒值
         */
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));

        /**(7)String getPath()
         *      获取创建文件对象时，使用的路径
         */
        System.out.println("file.getPath() = " + file.getPath());

        /**(8)String getAbsolutePath()
         *      获取文件的绝对路径
         */
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    }
}
