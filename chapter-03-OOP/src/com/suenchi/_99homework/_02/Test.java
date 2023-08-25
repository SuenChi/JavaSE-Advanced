package com.suenchi._99homework._02;
//请补充下列代码，使测试类编译通过并运行
public class Test {
    public static void main(String[] args){
        // 请补齐代码，调用method方法,使得method方法运行
        //1. ___________________?
        method();
    }

    //定义静态方法
    public static void method(){
        // 请补齐代码，调用Person类中的eat方法
        //2.___________________?
        Person.eat();
    }
}

/**答案分析
 * 1.静态的属于类,优先于对象存在,所以静态的方法调用本类其他的静态方法,可以直接调用,或者可以类名直接调用
 * 2.静态的访问其他类的静态方法,可以类名直接调用也可以创建对象之后调用
 */