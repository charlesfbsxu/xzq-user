package com.xzq.user.biz.userInfo.service.impl;

import com.xzq.user.biz.userInfo.bo.UserInfoBO;
import com.xzq.user.biz.userInfo.service.UserInfoService;
import com.xzq.user.dao.domain.UserInfoDO;
import com.xzq.user.dao.dto.UserInfoQueryDTO;
import com.xzq.user.dao.mapper.UserInfoDao;
import org.apache.commons.collections4.CollectionUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public long insert(UserInfoBO record) {
        if (null == record) {
            return 0;
        }

        UserInfoDO userInfoDO = mapper.map(record, UserInfoDO.class);
        userInfoDao.insert(userInfoDO);
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
        UserInfoDO userInfoDO = userInfoDao.findById(id);
        if (userInfoDO == null) {
            return null;
        }
        return mapper.map(userInfoDO, UserInfoBO.class);
    }

    @Override
    public List<UserInfoBO> findByCondition(UserInfoQueryDTO record) {
        List<UserInfoDO> userInfoDOS = userInfoDao.findByCondition(record);
        if (CollectionUtils.isEmpty(userInfoDOS)) {
            return Collections.EMPTY_LIST;
        }
        return userInfoDOS.stream().map(i -> mapper.map(i, UserInfoBO.class)).collect(Collectors.toList());
    }
}
