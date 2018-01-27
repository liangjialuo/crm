package com.zking.crm.base.mapper;

import com.zking.crm.base.model.RoleFunction;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);
}