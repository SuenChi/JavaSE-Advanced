package com.suenchi._02Exception;

/**
 * 自定义异常的创建
 */
public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
