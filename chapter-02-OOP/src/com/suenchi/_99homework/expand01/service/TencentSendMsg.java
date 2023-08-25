package com.suenchi._99homework.expand01.service;

public class TencentSendMsg extends SendMsg{
    @Override
    protected void sendMsgToPhone(String msg, String phone) {
        System.out.println("访问腾讯云平台给"+phone+"发送短信验证码:"+msg);
    }
}
