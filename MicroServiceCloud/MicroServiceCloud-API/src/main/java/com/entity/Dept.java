package com.entity;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2020/5/5 23:47
 **/
@SuppressWarnings("serial")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    private String db_source;
}
