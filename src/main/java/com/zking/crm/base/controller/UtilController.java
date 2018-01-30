package com.zking.crm.base.controller;

import com.zking.crm.base.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {
    @RequestMapping("/index")
    public String index(User user) {
        System.out.println("***********************************");
        System.out.println(user);
        System.out.println("***********************************");
        return "index";
    }

    //销售管理
    @RequestMapping("/sale/list")
    public String saleList() {
        return "sale/list";
    }

    //指派
    @RequestMapping("/sale/dispatch")
    public String saleDispatch() {
        return "sale/dispatch";
    }

    //客户开发计划===制定计划
    @RequestMapping("/sale/add")
    public String saleAdd() {
        return "sale/add";
    }

    //编辑
    @RequestMapping("/sale/edit")
    public String saleEdit() {
        return "sale/edit";
    }

    //客户开发计划
    @RequestMapping("/sale/dev")
    public String saleDdit() {
        return "sale/dev";
    }

    //客户开发计划===查看
    @RequestMapping("/sale/dev_detail")
    public String saleDevDetail() {
        return "sale/dev_detail";
    }

    //客户开发计划===执行计划
    @RequestMapping("/sale/dev_execute")
    public String saleDevExecute() {
        return "sale/dev_execute";
    }

    //客户开发计划===制定计划
    @RequestMapping("/sale/dev_plan")
    public String saleDevPlan() {
        return "sale/dev_plan";
    }


    //客户开发计划===制定计划
    @RequestMapping("/service/add")
    public String serviceAdd(User user) {
        System.out.println("***********************************");
        System.out.println(user);
        System.out.println("***********************************");
        return "service/add";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/arch")
    public String serviceArch() {
        return "service/arch";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/deal")
    public String serviceDeal() {
        return "service/deal";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/deal_detail")
    public String serviceDealDetail() {
        return "service/deal_detail";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/detail")
    public String serviceDetail() {
        return "service/detail";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/dispatch")
    public String serviceDispatch() {
        return "service/dispatch";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/feedback")
    public String serviceFeedback() {
        return "service/feedback";
    }

    //客户开发计划===制定计划
    @RequestMapping("/service/feedback_detail")
    public String serviceFeedbackDetail() {
        return "service/feedback_detail";
    }


    @RequestMapping("/datagrid3")
    public String datagrid3() {
        return "datagrid3";
    }

    @RequestMapping("/tree2")
    public String tree2() {
        return "tree2";
    }

    @RequestMapping("/treegrid")
    public String treegrid() {
        return "treegrid";
    }

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println("***********************************");
        System.out.println(user);
        System.out.println("***********************************");
        return "login";
    }
}
