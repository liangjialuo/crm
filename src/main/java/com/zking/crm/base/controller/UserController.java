package com.zking.crm.base.controller;

import com.zking.crm.base.biz.IUserBiz;
import com.zking.crm.base.model.User;
import com.zking.crm.base.util.UtilSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserBiz iUserBiz;

    @RequestMapping("/login")
    public String login(Model model, User user) {
        User login = iUserBiz.login(user);
        if(login!=null){
            UtilSession.getSession().setAttribute("user", login);
            return "index";
        }
        return "login";
    }
}
