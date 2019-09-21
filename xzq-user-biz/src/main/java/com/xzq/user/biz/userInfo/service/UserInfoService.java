package com.xzq.user.biz.userInfo.service;

import com.xzq.user.biz.userInfo.bo.UserInfoBO;
import com.xzq.user.dao.dto.UserInfoQueryDTO;

import java.util.List;

public interface UserInfoService {
    /**
     *
     * 方法insert的功能描述：新增用户基本信息表
     *
     * @param record
     * @return long
     * <PRE>
     * author xzq
     * Date 2019年08月10日
     * </PRE>
     */
    long insert(UserInfoBO record);

    /**
     *
     * 方法deleteById的功能描述：根据Id删除用户基本信息表
     *
     * @param id
     * @return int
     * <PRE>
     * author xzq
     * Date 2019年08月10日
     * </PRE>
     */
    int deleteById(Long id);

    /**
     *
     * 方法updateById的功能描述：根据Id更新用户基本信息表
     *
     * @param record
     * @return int
     * <PRE>
     * author xzq
     * Date 2019年08月10日
     * </PRE>
     */
    int updateById(UserInfoBO record);

    /**
     *
     * 方法findById的功能描述：根据Id查询用户基本信息表
     *
     * @param id
     * @return UserInfoBO
     * <PRE>
     * author xzq
     * Date 2019年08月10日
     * </PRE>
     */
    UserInfoBO findById(Long id);


    /**
     *
     * 方法findByCondition的功能描述：根据用户基本信息表查询用户基本信息表
     *
     * @param record
     * @return UserInfoBO
     *
    <PRE>
     * author xzq
     * Date 2019年08月10日
     * </PRE>
     */
    List<UserInfoBO> findByCondition(UserInfoQueryDTO record);

}
