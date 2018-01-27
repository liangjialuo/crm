package com.zking.crm.base.model;

import java.math.BigDecimal;

public class Product {
    private Integer prodId;

    private String prodName;

    private String prodType;

    private String prodBatch;

    private String prodUnit;

    private BigDecimal prodPrice;

    private String prodMemo;

    public Product(Integer prodId, String prodName, String prodType, String prodBatch, String prodUnit, BigDecimal prodPrice, String prodMemo) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodBatch = prodBatch;
        this.prodUnit = prodUnit;
        this.prodPrice = prodPrice;
        this.prodMemo = prodMemo;
    }

    public Product() {
        super();
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch;
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit;
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdMemo() {
        return prodMemo;
    }

    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo;
    }
}