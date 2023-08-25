package com.itheima.regex;

public class RegexDemo6 {
    public static void main(String[] args) {
        //编写两个方法分别用于校验手机号/座机号码
        checkMobileNumber("13866668888"); //T
        checkMobileNumber("12866668888"); //F
        checkMobileNumber("33866668888"); //F
        checkMobileNumber("3386666888a"); //F
        checkMobileNumber("338666688888"); //F

        checkPhoneNumber("010-12345"); //T
        checkPhoneNumber("01-12345"); //F
        checkPhoneNumber("01012345"); //T
        checkPhoneNumber("010-12345678"); //T
        checkPhoneNumber("010-123456789"); //F
    }

    public static void checkMobileNumber(String mobileNumber) {
        /*
        分析:手机号码范例【13833348009】【17710327783】
            (1)手机号总长11位,手机号码的第一位一定是1 [1]
            (2)根据现行手机号规范要求,第二位的范围在3-9之间 [3-9]
            (3)剩余的9位必须是数字而且必须是9位 \\d{9}
         */
        String mobileNumberRegex = "[1][3-9]\\d{9}";
        System.out.println("手机号码【" + mobileNumber + "】是否符合要求:" + mobileNumber.matches(mobileNumberRegex));
    }

    public static void checkPhoneNumber(String phoneNumber) {
        /*
        分析:座机号码范例【010-12345】【0313-3067865】【021-3878263】【010123456】
            (1)区号第一位一定是0,后面可以有2-3位 [0]\\d{2,3}
            (2)区号与具体座机号码中间的-可以有也可以没有 [-]?
            (3)具体的座机号码最少是5位最多不超过8位 \\d{5,8}
         */
        String phoneNumberRegex = "[0]\\d{2,3}[-]?\\d{5,8}";
        System.out.println("手机号码【" + phoneNumber + "】是否符合要求:" + phoneNumber.matches(phoneNumberRegex));
    }

}
