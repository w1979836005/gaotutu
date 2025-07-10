package com.gaoqiao.gaotutuback.demos.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
   SUCCESS(0, "ok"),
   PARAMS_ERROR(40000, "请求参数错误"),
   NOT_LOGIN_ERROR(40100, "未登录"),
   NO_AUTH_ERROR(40101, "无权限"),
   NOT_FOUND_ERROR(40400, "请求数据不存在"),
   FORBIDDEN_ERROR(40300, "禁止访问"),
   SYSTEM_ERROR(50000, "系统内部异常"),
   OPERATION_ERROR(50001, "操作失败");

   /**
    * 状态码
    */
   private final int code;

   /**
    * 信息
    */
   private final String message;

// 构造函数，用于初始化ErrorCode对象
   ErrorCode(int code, String message) {
      // 将传入的code参数赋值给对象的code属性
      this.code = code;
      // 将传入的message参数赋值给对象的message属性
      this.message = message;
   }
}