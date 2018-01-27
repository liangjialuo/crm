package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
}