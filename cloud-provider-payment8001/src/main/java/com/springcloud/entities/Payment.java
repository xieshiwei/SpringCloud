package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 10/26/2020 11:16 PM
 **/
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
