package com.zking.crm.whg.biz.impl;

import com.zking.crm.base.mapper.RoleMapper;
import com.zking.crm.base.model.Role;
import com.zking.crm.whg.biz.IRoleBiz;
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
