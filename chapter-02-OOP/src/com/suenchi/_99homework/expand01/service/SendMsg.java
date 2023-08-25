package com.suenchi._99homework.expand01.service;

import com.suenchi._99homework.expand01.domain.CheckCode;

import java.util.ArrayList;
import java.util.Random;

public abstract class SendMsg {
    // 存储短信验证码的集合
    public ArrayList<CheckCode> arrayList = new ArrayList<>() ;

    // 定义发送短信验证码时可选的数字字符
    public char[] chs = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'} ;

    // 发送短信验证码的方法
    public final void sendMsg(String phone) {
        StringBuffer code=new StringBuffer();
        // 补全代码
        Random r=new Random();
        //生成验证码
        for (int i = 0; i < 4; i++) {
            code.append(chs[r.nextInt(chs.length)]);
        }
        //发送验证码
        sendMsgToPhone(code.toString(),phone);

        //放到集合中
        CheckCode checkCode=new CheckCode();
        checkCode.setCheckCode(code.toString());
        checkCode.setPhone(phone);
        arrayList.add(checkCode);
    }

    protected abstract void sendMsgToPhone(String msg,String phone);
}
