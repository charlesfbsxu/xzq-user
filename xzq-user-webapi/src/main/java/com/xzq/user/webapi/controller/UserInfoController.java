package com.xzq.user.webapi.controller;

import com.xzq.user.biz.userInfo.bo.UserInfoBO;
import com.xzq.user.biz.userInfo.service.UserInfoService;
import com.xzq.user.common.vo.ResultVO;
import com.xzq.user.webapi.dto.UserInfoDTO;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    Mapper mapper;

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultVO<Long> insert(@RequestBody UserInfoDTO userInfoDTO) {
        UserInfoBO userInfoBO = mapper.map(userInfoDTO, UserInfoBO.class);
        return ResultVO.newSuccessResult(userInfoService.insert(userInfoBO));
    }

    @GetMapping(value = "/hello")
    public String hah() {
        return "hahah";
    }

}
