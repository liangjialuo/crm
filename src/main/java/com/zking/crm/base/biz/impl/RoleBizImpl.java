package com.zking.crm.base.biz.impl;

import com.zking.crm.base.biz.IRoleBiz;
import com.zking.crm.base.mapper.RoleMapper;
import com.zking.crm.base.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleBizImpl implements IRoleBiz {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> list(Role role) {
        return null;
    }
}
