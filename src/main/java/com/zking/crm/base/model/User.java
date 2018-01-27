package com.zking.crm.base.model;

public class User {
    private Integer usrId;

    private Integer roleId;

    private String usrName;

    private String usrPassword;

    private Integer usrFlag;

    public User(Integer usrId, Integer roleId, String usrName, String usrPassword, Integer usrFlag) {
        this.usrId = usrId;
        this.roleId = roleId;
        this.usrName = usrName;
        this.usrPassword = usrPassword;
        this.usrFlag = usrFlag;
    }

    public User() {
        super();
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Integer getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Integer usrFlag) {
        this.usrFlag = usrFlag;
    }
}