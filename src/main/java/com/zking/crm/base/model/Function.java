package com.zking.crm.base.model;

import org.springframework.stereotype.Repository;

@Repository
public class Function {
    private Integer functionId;

    private String functionName;

    private String path;

    private Integer parameter;

    private Integer method;

    private String functionDesc;

    public Function(Integer functionId, String functionName, String path, Integer parameter, Integer method, String functionDesc) {
        this.functionId = functionId;
        this.functionName = functionName;
        this.path = path;
        this.parameter = parameter;
        this.method = method;
        this.functionDesc = functionDesc;
    }

    public Function() {
        super();
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getParameter() {
        return parameter;
    }

    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }
}