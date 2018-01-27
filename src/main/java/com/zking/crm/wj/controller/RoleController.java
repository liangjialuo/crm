package com.zking.crm.wj.controller;

import com.zking.crm.base.model.Role;
import com.zking.crm.wj.biz.IRoleBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private IRoleBiz iRoleBiz;

    @RequestMapping("/roleList")
    @ResponseBody
    public List<Role> rightList(Role right, HttpServletResponse response) {
        System.out.println(15616);
        System.out.println("dsadasdasdasd");
        return iRoleBiz.list(right);
    }
}
