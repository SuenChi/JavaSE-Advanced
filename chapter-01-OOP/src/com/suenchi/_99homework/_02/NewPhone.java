package com.suenchi._99homework._02;

//来电显示手机号,头像,归属地
public class NewPhone extends OldPhone{
    @Override
    public void callerID() {
        super.callerID();
        System.out.println("显示来电头像");
        System.out.println("显示来电归属地");
    }
}
