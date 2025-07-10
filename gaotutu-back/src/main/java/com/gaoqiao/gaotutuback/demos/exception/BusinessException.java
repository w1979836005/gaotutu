package com.gaoqiao.gaotutuback.demos.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

// 构造函数，用于创建BusinessException对象
    public BusinessException(int code, String message) {
        // 调用父类构造函数，传入message参数
        super(message);
        // 将code参数赋值给成员变量
        this.code = code;
    }

// 构造函数，用于创建BusinessException对象，传入ErrorCode参数
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

// 构造函数，用于创建BusinessException对象，传入ErrorCode和message参数
    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}