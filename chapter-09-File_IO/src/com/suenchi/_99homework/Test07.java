package com.suenchi._99homework;

import java.io.File;
import java.util.Scanner;

/**基础题7:
 * 请编写程序从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("被拷贝文件夹(目录) : ");
        File fromFile=new File(sc.next());
        System.out.println("拷贝到文件夹(目录) : ");
        File toFile=new File(sc.next());
        func(fromFile, toFile);
        //例如: C:/user/Cooper/a.txt-->C:/user/Cassius
    }

    private static void func(File fromFile,File toFile) {
        if(fromFile.isFile()){

        }else if(fromFile.isDirectory()){
            File[] files = fromFile.listFiles();
            if (files != null) {
                for (File f : files) {

                }
            }else{

            }
        }
    }
}