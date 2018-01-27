package com.zking.crm.wj.biz.impl;

import com.zking.crm.base.mapper.FunctionMapper;
import com.zking.crm.base.model.Function;
import com.zking.crm.wj.biz.IFunctionBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionBizImpl implements IFunctionBiz {
    @Autowired
    private FunctionMapper functionMapper;

    @Override
    public List<Function> list(Function function) {
        return functionMapper.list(function);
    }
}
