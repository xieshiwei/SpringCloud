package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 10/26/2020 11:18 PM
 **/
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class CommonResult<T> {
    private Integer code;
    private String message;
    //传进来什么类型返回什么类型
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
