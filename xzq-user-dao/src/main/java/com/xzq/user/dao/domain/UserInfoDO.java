package com.xzq.user.dao.domain;

import lombok.Data;

/**
 * 类UserInfoDO.java的实现描述：用户基本信息表
 * 
 * @Author xzq
 * @Date 2019年08月10日
 */
@Data
public class UserInfoDO {
    /**
     * 主键
     */
    private Long id;
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
    /**
     * 修改人
     */
    private Long gmtUpdateUser;
    /**
     * 创建时间
     */
    private java.util.Date gmtCreateDate;
    /**
     * 创建时间
     */
    private java.util.Date gmtUpdateDate;
}