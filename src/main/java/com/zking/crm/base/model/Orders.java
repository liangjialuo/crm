package com.zking.crm.base.model;

import java.util.Date;

public class Orders {
    private Integer odrId;

    private String odrCustomer;

    private Date odrDate;

    private String odrAddr;

    private Integer odrStatus;

    public Orders(Integer odrId, String odrCustomer, Date odrDate, String odrAddr, Integer odrStatus) {
        this.odrId = odrId;
        this.odrCustomer = odrCustomer;
        this.odrDate = odrDate;
        this.odrAddr = odrAddr;
        this.odrStatus = odrStatus;
    }

    public Orders() {
        super();
    }

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public String getOdrCustomer() {
        return odrCustomer;
    }

    public void setOdrCustomer(String odrCustomer) {
        this.odrCustomer = odrCustomer;
    }

    public Date getOdrDate() {
        return odrDate;
    }

    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr;
    }

    public Integer getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(Integer odrStatus) {
        this.odrStatus = odrStatus;
    }
}