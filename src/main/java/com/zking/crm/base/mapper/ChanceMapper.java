package com.zking.crm.base.mapper;

import com.zking.crm.base.model.Chance;

public interface ChanceMapper {
    int deleteByPrimaryKey(Integer chcId);

    int insert(Chance record);

    int insertSelective(Chance record);

    Chance selectByPrimaryKey(Integer chcId);

    int updateByPrimaryKeySelective(Chance record);

    int updateByPrimaryKey(Chance record);
}