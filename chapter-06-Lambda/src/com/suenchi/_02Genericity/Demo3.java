package com.suenchi._02Genericity;

/**
 * 1.泛型作为方法形参
 * 2.匿名内部类快速创建泛型接口的实现类对象
 * 3.泛型接口的定义
 */
public class Demo3 {
    public static void main(String[] args) {

        /**
         * 匿名内部类快速创建泛型接口的实现类对象,作为实参调用以泛型为形参的方法
         */
        useMachine(new Machine<IceCream>() {
            @Override
            public IceCream make() {
                return new IceCream("香草味");
            }
        });

        useMachine(new IceCreamMachine());

    }

    /**
     * 泛型作为方法形参
     * @param machine
     */
    public static void useMachine(Machine<IceCream> machine){
        IceCream iceCream = machine.make();
    }
}

/**
 * 定义JavaBean
 */
class IceCream{
    private String taste;

    @Override
    public String toString() {
        return "IceCream{" +
                "taste='" + taste + '\'' +
                '}';
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public IceCream(String taste) {
        this.taste = taste;
    }

    public IceCream() {
    }
}

/**
 * 如何定义泛型接口
 * @param <T> 对于make方法返回值的类型不明确,可以使用泛型作为未知的数据类型进行占位
 */
interface Machine<T>{
    T make();
}

/**
 * 如何实现泛型类接口
 *      public class 实现类名 implements 接口名<具体类型> {}
 */
class IceCreamMachine implements Machine<IceCream>{

    @Override
    public IceCream make() {
        return new IceCream("草莓味");
    }
}