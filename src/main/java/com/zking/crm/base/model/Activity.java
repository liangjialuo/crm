package com.zking.crm.base.model;

import java.util.Date;

public class Activity {
    private Integer atvId;

    private String custNo;

    private String atvCustName;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvRemark;

    private String atvDesc;

    public Activity(Integer atvId, String custNo, String atvCustName, Date atvDate, String atvPlace, String atvTitle, String atvRemark, String atvDesc) {
        this.atvId = atvId;
        this.custNo = custNo;
        this.atvCustName = atvCustName;
        this.atvDate = atvDate;
        this.atvPlace = atvPlace;
        this.atvTitle = atvTitle;
        this.atvRemark = atvRemark;
        this.atvDesc = atvDesc;
    }

    public Activity() {
        super();
    }

    public Integer getAtvId() {
        return atvId;
    }

    public void setAtvId(Integer atvId) {
        this.atvId = atvId;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getAtvCustName() {
        return atvCustName;
    }

    public void setAtvCustName(String atvCustName) {
        this.atvCustName = atvCustName;
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace;
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle;
    }

    public String getAtvRemark() {
        return atvRemark;
    }

    public void setAtvRemark(String atvRemark) {
        this.atvRemark = atvRemark;
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc;
    }
}