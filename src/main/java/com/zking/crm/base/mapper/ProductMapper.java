package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}