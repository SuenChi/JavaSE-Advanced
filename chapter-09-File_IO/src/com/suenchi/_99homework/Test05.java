package com.suenchi._99homework;

import java.io.File;
import java.util.Scanner;

/**基础题5:计算文件夹的大小
 * 要求通过键盘录入文件夹路径
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件夹路径 : ");
        File file=new File(sc.next());
        if(!file.exists()){
            System.out.println("文件夹不存在");
            return;
        }
        func(file);
        System.out.println("dirSize = " + dirSize);

    }
    public static Long dirSize=0L;

    public static void func(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    func(f);
                }
            }
        }else{
            dirSize+=file.length();
        }
    }
}