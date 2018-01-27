package com.zking.crm.base.mapper;

import com.zking.crm.base.model.OrdersLine;

public interface OrdersLineMapper {
    int deleteByPrimaryKey(Integer oddId);

    int insert(OrdersLine record);

    int insertSelective(OrdersLine record);

    OrdersLine selectByPrimaryKey(Integer oddId);

    int updateByPrimaryKeySelective(OrdersLine record);

    int updateByPrimaryKey(OrdersLine record);
}