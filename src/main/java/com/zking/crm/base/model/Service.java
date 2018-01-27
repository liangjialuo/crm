package com.zking.crm.base.model;

import java.util.Date;

public class Service {
    private Integer svrId;

    private String custNo;

    private Integer usrId;

    private Integer sysUsrId;

    private Integer sysUsrId2;

    private String svrType;

    private String svrTitle;

    private String svrStatus;

    private String svrRequest;

    private Date svrCreateDate;

    private Date svrDueDate;

    private String svrDeal;

    private Date svrDealDate;

    private String svrResult;

    private String svrSatisfy;

    public Service(Integer svrId, String custNo, Integer usrId, Integer sysUsrId, Integer sysUsrId2, String svrType, String svrTitle, String svrStatus, String svrRequest, Date svrCreateDate, Date svrDueDate, String svrDeal, Date svrDealDate, String svrResult, String svrSatisfy) {
        this.svrId = svrId;
        this.custNo = custNo;
        this.usrId = usrId;
        this.sysUsrId = sysUsrId;
        this.sysUsrId2 = sysUsrId2;
        this.svrType = svrType;
        this.svrTitle = svrTitle;
        this.svrStatus = svrStatus;
        this.svrRequest = svrRequest;
        this.svrCreateDate = svrCreateDate;
        this.svrDueDate = svrDueDate;
        this.svrDeal = svrDeal;
        this.svrDealDate = svrDealDate;
        this.svrResult = svrResult;
        this.svrSatisfy = svrSatisfy;
    }

    public Service() {
        super();
    }

    public Integer getSvrId() {
        return svrId;
    }

    public void setSvrId(Integer svrId) {
        this.svrId = svrId;
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

    public Integer getSysUsrId() {
        return sysUsrId;
    }

    public void setSysUsrId(Integer sysUsrId) {
        this.sysUsrId = sysUsrId;
    }

    public Integer getSysUsrId2() {
        return sysUsrId2;
    }

    public void setSysUsrId2(Integer sysUsrId2) {
        this.sysUsrId2 = sysUsrId2;
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType;
    }

    public String getSvrTitle() {
        return svrTitle;
    }

    public void setSvrTitle(String svrTitle) {
        this.svrTitle = svrTitle;
    }

    public String getSvrStatus() {
        return svrStatus;
    }

    public void setSvrStatus(String svrStatus) {
        this.svrStatus = svrStatus;
    }

    public String getSvrRequest() {
        return svrRequest;
    }

    public void setSvrRequest(String svrRequest) {
        this.svrRequest = svrRequest;
    }

    public Date getSvrCreateDate() {
        return svrCreateDate;
    }

    public void setSvrCreateDate(Date svrCreateDate) {
        this.svrCreateDate = svrCreateDate;
    }

    public Date getSvrDueDate() {
        return svrDueDate;
    }

    public void setSvrDueDate(Date svrDueDate) {
        this.svrDueDate = svrDueDate;
    }

    public String getSvrDeal() {
        return svrDeal;
    }

    public void setSvrDeal(String svrDeal) {
        this.svrDeal = svrDeal;
    }

    public Date getSvrDealDate() {
        return svrDealDate;
    }

    public void setSvrDealDate(Date svrDealDate) {
        this.svrDealDate = svrDealDate;
    }

    public String getSvrResult() {
        return svrResult;
    }

    public void setSvrResult(String svrResult) {
        this.svrResult = svrResult;
    }

    public String getSvrSatisfy() {
        return svrSatisfy;
    }

    public void setSvrSatisfy(String svrSatisfy) {
        this.svrSatisfy = svrSatisfy;
    }
}