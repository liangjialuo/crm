package com.zking.crm.whg.biz;

import com.zking.crm.base.mapper.ServiceMapper;
import com.zking.crm.base.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceBizImpl implements IServiceBiz {
    @Autowired
    private ServiceMapper serviceMapper;


    @Override
    public void add(Service service) {

        serviceMapper.insert(service);
    }

    @Override
    public void edit(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public void del(Service service) {
        serviceMapper.deleteByPrimaryKey(service.getSvrId());
    }
}
