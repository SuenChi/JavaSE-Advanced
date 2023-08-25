package com.suenchi._02Exception;

import java.io.IOException;
import java.util.Objects;

/**
 * 运行期异常 : 直接抛出,不需要在方法上声明可抛出异常,也不需要try...catch
 */

public class Demo1 {
    public static void main(String[] args) {
        func1(null);
    }

    /**
     * 运行期异常 : RuntimeException异常类及其子类
     *      直接抛出
     * @param arr
     */
    public static void func1(int[] arr){
        if(Objects.isNull(arr)){
            throw new NullPointerException();
            //抛出异常语句其后的代码为`unreachable`
        }
    }
}
