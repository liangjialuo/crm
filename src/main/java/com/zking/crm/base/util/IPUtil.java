package com.zking.crm.base.util;

import javax.servlet.http.HttpServletRequest;

public class IPUtil {

    public static String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        System.out.println();
        return request.getHeader("x-forwarded-for");
    }
}
