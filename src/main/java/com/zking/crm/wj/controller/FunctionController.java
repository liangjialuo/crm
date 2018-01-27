package com.zking.crm.wj.controller;

import com.zking.crm.base.model.Function;
import com.zking.crm.wj.biz.IFunctionBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FunctionController {
    @Autowired
    private IFunctionBiz iFunctionBiz;

    @RequestMapping("/functionList")
    @ResponseBody
    public Map<String, Object> functionList(Function function) {
        Map<String, Object> map = new HashMap<String, Object>();
        function.setFunctionDesc("1");
        List<Function> list1 = iFunctionBiz.list(function);

        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = null;
        for (Function f : list1) {
            map1 = new HashMap<String, Object>();
            map1.put("menuid", f.getFunctionId());
            map1.put("icon", "icon-sys");
            map1.put("menuname", f.getFunctionName());
            if ("1".equals(f.getFunctionDesc())) {
                Function function2 = new Function();
                function2.setMethod(f.getFunctionId());
                List<Function> list2 = iFunctionBiz.list(function2);
                List<Map<String, Object>> listMap2 = new ArrayList<Map<String, Object>>();
                Map<String, Object> map2 = null;
                for (Function f2 : list2) {
                    map2 = new HashMap<String, Object>();
                    map2.put("menuid", f2.getFunctionId());
                    map2.put("icon", "icon-sys");
                    map2.put("menuname", f2.getFunctionName());
                    map2.put("url", f2.getPath());
                    listMap2.add(map2);
                }
                map1.put("menus", listMap2);
            }
            listMap.add(map1);
        }
        map.put("menus", listMap);
        return map;
    }

}
