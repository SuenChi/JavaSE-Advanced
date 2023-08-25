package com.suenchi._99homework;

import java.io.File;
import java.util.Scanner;

/**基础题4:打印文件夹的目录结构
 */
public class Test04 {
    public static void main(String[] args) {
        //获得文件夹File对象
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入文件夹的目录 : ");
        File file=new File(sc.next());
        if(!file.exists()){
            System.out.println("文件路径不存在!");
            return;
        }
        func(file,1);
    }

    public static void func(File file,int level){
        //打印当前文件/文件夹
        System.out.println("|-"+file.getName());
        //若当前是文件夹, 则需进一步操作
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null) {
                for (File listFile : files) {
                    //根据当前递归的层数, 确定需要缩进的次数
                    //层数越多, 则需要缩进地越多
                    for (int i = 0; i < level; i++) {
                        System.out.print("\t");
                    }
                    func(listFile,level+1);
                }
            }
        }
    }
}