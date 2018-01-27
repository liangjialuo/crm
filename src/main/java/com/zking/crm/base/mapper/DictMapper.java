package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Dict;

public interface DictMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}