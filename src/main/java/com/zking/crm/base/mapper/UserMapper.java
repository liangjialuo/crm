package com.zking.crm.base.mapper;

import com.zking.crm.base.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer usrId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}