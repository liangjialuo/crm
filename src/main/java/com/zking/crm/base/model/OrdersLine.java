package com.zking.crm.base.model;

import java.math.BigDecimal;

public class OrdersLine {
    private Integer oddId;

    private Integer prodId;

    private Integer odrId;

    private Integer oddCount;

    private String oddUnit;

    private BigDecimal oddPrice;

    public OrdersLine(Integer oddId, Integer prodId, Integer odrId, Integer oddCount, String oddUnit, BigDecimal oddPrice) {
        this.oddId = oddId;
        this.prodId = prodId;
        this.odrId = odrId;
        this.oddCount = oddCount;
        this.oddUnit = oddUnit;
        this.oddPrice = oddPrice;
    }

    public OrdersLine() {
        super();
    }

    public Integer getOddId() {
        return oddId;
    }

    public void setOddId(Integer oddId) {
        this.oddId = oddId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public Integer getOddCount() {
        return oddCount;
    }

    public void setOddCount(Integer oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit;
    }

    public BigDecimal getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(BigDecimal oddPrice) {
        this.oddPrice = oddPrice;
    }
}