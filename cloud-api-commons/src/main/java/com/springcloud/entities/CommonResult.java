package com.springcloud.entities;

import java.io.Serializable;

/**
 * @ClassName 返回结果
 * @Author xsw
 * @Description //TODO
 * @Date 10/26/2020 11:18 PM
 **/
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 构造
     *
     * @param code
     * @param message
     * @param data
     */
    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult() {

    }


}
