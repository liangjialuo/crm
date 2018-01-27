package com.zking.crm.base.controller;

import com.zking.crm.base.biz.IRightBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RightController {

    @Autowired
    private IRightBiz iRightBiz;

}
