package com.suenchi._02final.example03;

public class Demo {
    public static void main(String[] args) {
        /**
         * 1:系统启用
         * 0:系统停用
         * 如何在代码中表示启用/停用?
         * 解决方法:抽取为全局常量(全局都可访问[static],值不会改变[final])
         */
        showStatus(0);
        showStatus(1);
        showStatus(3);
    }
    public static void showStatus(int status){
        if(status==SystemStatusConstant.ENABLE){
            System.out.println("系统启用");
        }else if(status==SystemStatusConstant.DISABLE){
            System.out.println("系统停用");
        }else{
            System.out.println("状态码错误");
        }
    }
}