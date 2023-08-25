package com.suenchi._02inherit.example02;

public class iPhone14 extends iPhone4s{
    @Override
    public void chat() {
//        super.chat();
        System.out.println("使用基于QQ的聊天室进行聊天");
    }



    public void play(){
        System.out.println("打游戏");
    }

    public void watch(){
        System.out.println("使用智能手机看视频");
    }
}
