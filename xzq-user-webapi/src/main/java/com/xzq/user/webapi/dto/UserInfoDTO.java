package com.xzq.user.webapi.dto;

import lombok.Data;

/**
 * 类UserInfoDTO
 * 
 * @Author xzq
 * @Date 2019年08月10日
 */
@Data
public class UserInfoDTO {
    /**
     * 姓名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 地址
     */
    private String adress;
    /**
     * 创建人
     */
    private Long gmtCreateUser;
}