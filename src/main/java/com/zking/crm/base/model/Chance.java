package com.zking.crm.base.model;

import java.util.Date;

public class Chance {
    private Integer chcId;

    private Integer usrId;

    private String chcSource;

    private String chcCustName;

    private String chcTitle;

    private Integer chcRate;

    private String chcLinkman;

    private String chcTel;

    private String chcDesc;

    private Date chcCreateDate;

    private String chcDueTo;

    private Date chcDueDate;

    private Integer chcStatus;

    public Chance(Integer chcId, Integer usrId, String chcSource, String chcCustName, String chcTitle, Integer chcRate, String chcLinkman, String chcTel, String chcDesc, Date chcCreateDate, String chcDueTo, Date chcDueDate, Integer chcStatus) {
        this.chcId = chcId;
        this.usrId = usrId;
        this.chcSource = chcSource;
        this.chcCustName = chcCustName;
        this.chcTitle = chcTitle;
        this.chcRate = chcRate;
        this.chcLinkman = chcLinkman;
        this.chcTel = chcTel;
        this.chcDesc = chcDesc;
        this.chcCreateDate = chcCreateDate;
        this.chcDueTo = chcDueTo;
        this.chcDueDate = chcDueDate;
        this.chcStatus = chcStatus;
    }

    public Chance() {
        super();
    }

    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getChcSource() {
        return chcSource;
    }

    public void setChcSource(String chcSource) {
        this.chcSource = chcSource;
    }

    public String getChcCustName() {
        return chcCustName;
    }

    public void setChcCustName(String chcCustName) {
        this.chcCustName = chcCustName;
    }

    public String getChcTitle() {
        return chcTitle;
    }

    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle;
    }

    public Integer getChcRate() {
        return chcRate;
    }

    public void setChcRate(Integer chcRate) {
        this.chcRate = chcRate;
    }

    public String getChcLinkman() {
        return chcLinkman;
    }

    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman;
    }

    public String getChcTel() {
        return chcTel;
    }

    public void setChcTel(String chcTel) {
        this.chcTel = chcTel;
    }

    public String getChcDesc() {
        return chcDesc;
    }

    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc;
    }

    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    public String getChcDueTo() {
        return chcDueTo;
    }

    public void setChcDueTo(String chcDueTo) {
        this.chcDueTo = chcDueTo;
    }

    public Date getChcDueDate() {
        return chcDueDate;
    }

    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    public Integer getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(Integer chcStatus) {
        this.chcStatus = chcStatus;
    }
}