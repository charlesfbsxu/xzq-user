package com.xzq.user.dao.mapper;

import com.xzq.user.dao.domain.UserInfoDO;
import com.xzq.user.dao.dto.UserInfoQueryDTO;

import java.util.List;

/**
 * 用户基本信息表 DAO接口
 *
 * @Author xzq
 * @Date 2019年09月16日
 */
public interface UserInfoDao {

    /**
     *
     * 方法insert的功能描述：新增用户基本信息表
     *
     * @param record
     * @return int
     * <PRE>
     * author xzq 
     * Date 2019年09月16日
     * </PRE>
     */
    int insert(UserInfoDO record);

    /**
     *
     * 方法deleteById的功能描述：根据Id删除用户基本信息表
     *
     * @param id
     * @return int
     * <PRE>
     * author xzq 
     * Date 2019年09月16日
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
     * Date 2019年09月16日
     * </PRE>
     */
    int updateById(UserInfoDO record);

    /**
     *
     * 方法findById的功能描述：根据Id查询用户基本信息表
     *
     * @param id
     * @return UserInfoDO
     * <PRE>
     * author xzq 
     * Date 2019年09月16日
     * </PRE>
     */
    UserInfoDO findById(Long id);


     /**
     *
     * 方法findByCondition的功能描述：根据用户基本信息表查询用户基本信息表
     *
     * @param record
     * @return UserInfoDO
     *<PRE>
      * author xzq
      * Date 2019年09月16日
      * </PRE>
     */
     List<UserInfoDO> findByCondition(UserInfoQueryDTO record);
}