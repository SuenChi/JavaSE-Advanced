package com.suenchi._99homework;

/**
 * 基础题2: 啤酒问题
 * 需求：
 * 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
 * 请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。
 * <p>
 * 15瓶 3盖子 1瓶子
 */
public class Test02 {
    public static void main(String[] args) {
        //用钱可以买到的啤酒数
        bearNum = 5;
        func();
        System.out.println("bearNumSum = " + bearNumSum);
        System.out.println("lidNum = " + lidNum);
        System.out.println("bottleNum = " + bottleNum);
    }

    public static Integer bearNum = 0;
    public static Integer bearNumSum = 0;
    public static Integer bottleNum = 0;
    public static Integer lidNum = 0;


    public static void func() {
        //将bearNum瓶啤酒喝掉, 获得bearNum个空酒瓶, bearNum个瓶盖, 总共喝掉的啤酒数加bearNum
        bottleNum += bearNum;
        lidNum += bearNum;
        bearNumSum += bearNum;
        bearNum = 0;

        //酒瓶可以换得的啤酒数
        int i = bottleNum / 2;
        //瓶盖可以换得的啤酒数
        int j = lidNum / 4;

        //判断还能够换得啤酒
        if (i > 0 || j > 0) {
            bearNum += i;
            bottleNum -= i * 2;
            bearNum += j;
            lidNum -= j * 4;
            func();
        }
    }
}