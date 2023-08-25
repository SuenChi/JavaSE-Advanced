package com.suenchi._99homework;

/**基础题3:不死神兔
 * 假设一对刚出生的小兔一个月后就能长成大兔，再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡
 * 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
 */
public class Test03 {
    public static void main(String[] args) {
        /**
         * 第一月 : 小兔1
         * 第二月 : 大兔1
         * 第三月 : 大兔1+(小兔2)=2
         * 第四月 : 大兔1+(大兔2+小兔3)=3
         * 第五月 : 大兔1+(大兔2+(小兔4)+大兔3+小兔5)=5
         * 次月兔子的增加对数, 是上个月的大兔对数
         * 当月兔子对数 = 上月兔子对数 + 上上月兔子对数
         */
        System.out.println("一年内繁殖成 " + func(12)+" 对兔子");
    }


    /**
     * 返回第mon月的兔子对数
     * @param mon 月份
     * @return 该月份兔子对数
     */
    public static int func(int mon){
        if(mon==1||mon==2){
            return 1;
        }else{
            return func(mon-1)+func(mon-2);
        }
    }

}