package com.zking.crm.base.mapper;

import com.zking.crm.base.model.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}