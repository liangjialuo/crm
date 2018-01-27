package com.zking.crm.base.model;

import java.util.Date;

public class Plan {
    private Integer plaId;

    private Integer chcId;

    private Date plaDate;

    private String plaTodo;

    private String plaResult;

    public Plan(Integer plaId, Integer chcId, Date plaDate, String plaTodo, String plaResult) {
        this.plaId = plaId;
        this.chcId = chcId;
        this.plaDate = plaDate;
        this.plaTodo = plaTodo;
        this.plaResult = plaResult;
    }

    public Plan() {
        super();
    }

    public Integer getPlaId() {
        return plaId;
    }

    public void setPlaId(Integer plaId) {
        this.plaId = plaId;
    }

    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo;
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult;
    }
}