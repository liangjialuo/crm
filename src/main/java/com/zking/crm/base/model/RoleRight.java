package com.zking.crm.base.model;

public class RoleRight {
    private Integer rfId;

    private Integer rightCode;

    private Integer roleId;

    public RoleRight(Integer rfId, Integer rightCode, Integer roleId) {
        this.rfId = rfId;
        this.rightCode = rightCode;
        this.roleId = roleId;
    }

    public RoleRight() {
        super();
    }

    public Integer getRfId() {
        return rfId;
    }

    public void setRfId(Integer rfId) {
        this.rfId = rfId;
    }

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}