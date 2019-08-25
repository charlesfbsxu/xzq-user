package com.xzq.user.biz.userInfo.service.impl;

import com.xzq.user.biz.userInfo.bo.UserInfoBO;
import com.xzq.user.biz.userInfo.service.UserInfoService;
import com.xzq.user.dao.domain.UserInfoDO;
import com.xzq.user.dao.mapper.UserInfoMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public long insert(UserInfoBO record) {
        if(null == record){
            return 0;
        }

        UserInfoDO userInfoDO = mapper.map(record, UserInfoDO.class);
        userInfoMapper.insert(userInfoDO);
        return userInfoDO.getId();
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int updateById(UserInfoBO record) {
        return 0;
    }

    @Override
    public UserInfoBO findById(Long id) {
        return null;
    }

    @Override
    public List<UserInfoBO> findByCondition(UserInfoBO record) {
        return null;
    }
}
