package com.suenchi._05Runtime;

import java.io.IOException;

/**
 * Runtime表示当前运行环境 该类是一个单例类
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1.通过Runtime类的静态方法getRuntime获取到该类唯一的实例
        Runtime runtime=Runtime.getRuntime();

        //2.public int availableProcessors() : 获取当前系统的处理器核心数量
        System.out.println("当前机器的处理器核心数量 : "+runtime.availableProcessors());

        //3.public long totalMemory() : 获取虚拟机占用的总内存大小(单位:字节)
        System.out.println("当前虚拟机占用内存大小为 : "+runtime.totalMemory()/1024/1024+" MB");

        //4.public long freeMemory() : 获取虚拟机当前可用内存大小(单位:字节)
        System.out.println("当前虚拟机可用内存大小为 : "+runtime.freeMemory()/1024/1024+" MB");

        //5.public Process exec(String commond) : 基于传递的命令运行系统中的指定程序并返回表示该程序的Process进程对象
        // 运行系统中指定程序,并返回表示该进程的进程对象
        Process EdgeProcess = runtime.exec("\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"");
        EdgeProcess.destroy(); //销毁进程(关闭程序)

    }
}
