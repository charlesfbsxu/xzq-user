package com.test;

import com.xzq.user.biz.userInfo.bo.UserInfoBO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public UserInfoBO userInfoBO(){
        System.out.println("++++++++++++++++++++++");
        return new UserInfoBO();
    }
}
