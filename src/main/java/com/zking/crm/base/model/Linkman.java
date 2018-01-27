package com.zking.crm.base.model;

public class Linkman {
    private Integer lkmId;

    private String custNo;

    private String lkmCustName;

    private String lkmName;

    private Integer lkmSex;

    private String lkmPostion;

    private String lkmTel;

    private String lkmMobile;

    private String lkmMemo;

    public Linkman(Integer lkmId, String custNo, String lkmCustName, String lkmName, Integer lkmSex, String lkmPostion, String lkmTel, String lkmMobile, String lkmMemo) {
        this.lkmId = lkmId;
        this.custNo = custNo;
        this.lkmCustName = lkmCustName;
        this.lkmName = lkmName;
        this.lkmSex = lkmSex;
        this.lkmPostion = lkmPostion;
        this.lkmTel = lkmTel;
        this.lkmMobile = lkmMobile;
        this.lkmMemo = lkmMemo;
    }

    public Linkman() {
        super();
    }

    public Integer getLkmId() {
        return lkmId;
    }

    public void setLkmId(Integer lkmId) {
        this.lkmId = lkmId;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getLkmCustName() {
        return lkmCustName;
    }

    public void setLkmCustName(String lkmCustName) {
        this.lkmCustName = lkmCustName;
    }

    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    public Integer getLkmSex() {
        return lkmSex;
    }

    public void setLkmSex(Integer lkmSex) {
        this.lkmSex = lkmSex;
    }

    public String getLkmPostion() {
        return lkmPostion;
    }

    public void setLkmPostion(String lkmPostion) {
        this.lkmPostion = lkmPostion;
    }

    public String getLkmTel() {
        return lkmTel;
    }

    public void setLkmTel(String lkmTel) {
        this.lkmTel = lkmTel;
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }
}