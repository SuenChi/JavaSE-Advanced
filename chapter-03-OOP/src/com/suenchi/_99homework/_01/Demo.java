package com.suenchi._99homework._01;
//请补充下列代码，使测试类编译通过并运行
public class Demo {
    public static void main(String[] args) {
        // 请补齐代码，使得编译通过，并在控制台输出(吃饭)
        //______________________________?
        Demo demo=new Demo();
        demo.eat();
        /**答案解释
         * 静态成员不能直接访问非静态成员
         *  1.原因：因为静态的属于类,非静态的属于对象,在内存中静态的优先于非静态的成员存在,静态成员存在的时候,对象还没有存在,所以静态的不能直接访问非静态的.
         *  2.如果静态的想访问非静态的,需要创建对象,再调用非静态的成员.
         */
    }
    public void eat(){
        System.out.println("吃饭!");
    }
}