package com.zking.crm.base.mapper;

import com.zking.crm.base.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer usrId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer usrId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}