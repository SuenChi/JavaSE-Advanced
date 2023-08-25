package com.suenchi._99homework;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

/**基础题6:
 * 请编写程序实现文件夹的删除
 * 1.文件可直接删除
 * 2.空文件夹才能删除
 * 因此, 应该先将文件夹内的文件删除完, 然后再删除文件夹
 * ★删除不可恢复, 一定要谨慎
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*        System.out.print("请输入要删除的文件或文件夹: ");
        String dir=sc.next();*/
        String dir="C:\\Users\\Cooper\\Desktop\\chapter-01-static_继承";
//        sc.nextLine();
        File file=new File(dir);
        if(!file.exists()){
            System.out.println("文件夹路径不存在!");
            return;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"次警告, 请确认该文件是备份文件, 删除后无法恢复!!!");
            sc.nextLine();
        }
        func(file);
        System.out.println("删除完成!");
    }
    public static void func(File file){
        if(file.isFile()){
            file.delete();
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            if(Objects.isNull(files)){   //该文件夹内没有文件需要删除, 直接删除该文件夹
                file.delete();
            }
            else{
                for (File f : files) {
                    func(f);
                }
                //该文件夹内的文件都删除完了
                file.delete();
            }
        }
    }
}