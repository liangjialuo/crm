package com.zking.crm.wj.biz;

import com.zking.crm.base.model.Chance;

public interface IChanceBiz {
    //新增销售机会
    int add(Chance chance);

    //修改销售机会
    int edit(Chance chance);

    //删除销售机会
    void del(Chance chance);

    //指派销售机会
}
