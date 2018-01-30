package com.zking.crm.base.biz.impl;

import com.zking.crm.base.biz.IUserBiz;
import com.zking.crm.base.mapper.UserMapper;
import com.zking.crm.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements IUserBiz {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void login(User user) {
        userMapper.selectByPrimaryKey(user);
    }
}
