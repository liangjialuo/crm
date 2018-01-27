package com.zking.crm.base.model;

import java.util.Date;

public class Lost {
    private Integer lstId;

    private String custNo;

    private Integer usrId;

    private String lstCustName;

    private Date lstLastOrderDate;

    private Date lstLostDate;

    private String lstDelay;

    private String lstReason;

    private Integer lstStatus;

    public Lost(Integer lstId, String custNo, Integer usrId, String lstCustName, Date lstLastOrderDate, Date lstLostDate, String lstDelay, String lstReason, Integer lstStatus) {
        this.lstId = lstId;
        this.custNo = custNo;
        this.usrId = usrId;
        this.lstCustName = lstCustName;
        this.lstLastOrderDate = lstLastOrderDate;
        this.lstLostDate = lstLostDate;
        this.lstDelay = lstDelay;
        this.lstReason = lstReason;
        this.lstStatus = lstStatus;
    }

    public Lost() {
        super();
    }

    public Integer getLstId() {
        return lstId;
    }

    public void setLstId(Integer lstId) {
        this.lstId = lstId;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName;
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay;
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason;
    }

    public Integer getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(Integer lstStatus) {
        this.lstStatus = lstStatus;
    }
}