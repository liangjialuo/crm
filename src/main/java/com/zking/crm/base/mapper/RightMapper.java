package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Right;

public interface RightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}