package com.suenchi._01File;

import java.io.File;
import java.util.Arrays;

/**遍历文件夹
 * 1.String[] list()
 * 2.File[] listFiles()
 */
public class Demo4 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Cooper\\Downloads");
        /**(1)String[] list()
         *      获取当前目录下所有的一级文件名称, 放到一个字符串数组中并返回
         */
        String[] fileStrList = file.list();
        System.out.println("fileStrList = " + fileStrList);
        System.out.println(Arrays.toString(fileStrList));

        /**(2)File[] listFiles()
         *      获取当前目录下所有的一级文件对象，放到一个文件对象数组中并返回；
         *
         */
        File[] files = file.listFiles();
        System.out.println("files = " + files);
        for (File file1 : files) {
            System.out.println("file1 = " + file1);
        }

        /**注意
         * 1.当主调是文件时，或路径不存在时，返回null；
         * 2.当主调是空文件夹时，返回一个长度为0的数组；
         * 3.当主调是一个有内容的文件夹时，将里面所有一级文件(/文件夹)的路径(/File对象)放在File数组中返回；
         * 4.当主调是一个文件夹，且里面有隐藏文件时，将里面所有一级文件和文件夹的路径(/File对象)放在File数组中返回，包含隐藏文件
         * 5.当主调是一个文件夹，但是没有权限访问该文件夹时，返回null；
         */
    }
}
