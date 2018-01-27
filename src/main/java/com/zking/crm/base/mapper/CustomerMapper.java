package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String custNo);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String custNo);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}