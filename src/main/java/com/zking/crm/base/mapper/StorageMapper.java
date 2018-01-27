package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Storage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer stkId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer stkId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}