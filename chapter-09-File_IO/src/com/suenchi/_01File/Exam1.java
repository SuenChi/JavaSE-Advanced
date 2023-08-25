package com.suenchi._01File;

import java.io.File;
import java.util.HashMap;

/**案例:文件搜索
 * 传递一个表示文件夹的File对象, 运行完方法之后:
 * 1.统计总的字节数
 * 2.统计各种类型文件各有多少个
 * 要求: 使用递归
 */

public class Exam1 {
    public static void main(String[] args) {
//        File file=new File("C:\\Users\\Cooper\\Documents"); //不可访问
        File file=new File("C:\\Users\\Cooper\\Downloads\\chapter-01-Java面向对象高级(继承与静态)"); //不可访问
        getDirInfo(file);
        System.out.println(file+"总大小为"+grossByte+"(单位:字节)");
        TYPE_COUNT.forEach((key, value) -> System.out.println(key+ " 类型的文件共有 : "+value+" 个"));
    }
    private static Long grossByte=0L;    //总字节数

    private static final HashMap<String,Integer> TYPE_COUNT=new HashMap<>();    //各类型文件对应有多少个

    public static void getDirInfo(File file){
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if(listFile.isFile()){
                grossByte+=listFile.length();
                String fileName=listFile.getName();
                int ind = fileName.lastIndexOf(".");
                if(ind==-1){
                    continue;
                }
                String typeName = fileName.substring(ind);
                if(TYPE_COUNT.containsKey(typeName)){
                    TYPE_COUNT.put(typeName,TYPE_COUNT.get(typeName)+1);
                }else{
                    TYPE_COUNT.put(typeName,1);
                }
            }else{
                getDirInfo(listFile);
            }
        }
    }
}