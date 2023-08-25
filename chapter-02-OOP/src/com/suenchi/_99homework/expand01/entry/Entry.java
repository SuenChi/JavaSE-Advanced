package com.suenchi._99homework.expand01.entry;

import com.suenchi._99homework.expand01.service.AliyunSendMsg;
import com.suenchi._99homework.expand01.service.SendMsg;
import com.suenchi._99homework.expand01.service.TencentSendMsg;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        // 请输入手机号码
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请您输入登录的手机号码: ");
        String phone = sc.nextLine();

        // 调用发送短信类的方法发送短信验证码
        SendMsg sendMsg;
        sendMsg=new TencentSendMsg();
        sendMsg.sendMsg(phone);
        sendMsg=new AliyunSendMsg();
        sendMsg.sendMsg(phone);
    }
}