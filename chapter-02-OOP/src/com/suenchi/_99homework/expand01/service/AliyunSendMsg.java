package com.suenchi._99homework.expand01.service;

public class AliyunSendMsg extends SendMsg{
    @Override
    protected void sendMsgToPhone(String msg, String phone) {
        System.out.println("访问阿里云平台给"+phone+"发送短信验证码:"+msg);
    }
}