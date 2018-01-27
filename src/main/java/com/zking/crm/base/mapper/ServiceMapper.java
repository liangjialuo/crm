package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Integer svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Integer svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}