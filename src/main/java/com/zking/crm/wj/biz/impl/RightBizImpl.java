package com.zking.crm.wj.biz.impl;

import com.zking.crm.base.mapper.RightMapper;
import com.zking.crm.base.model.Right;
import com.zking.crm.wj.biz.IRightBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightBizImpl implements IRightBiz {
    @Autowired
    private RightMapper rightMapper;

    @Override
    public List<Right> list(Right right) {
        return null;
    }
}
