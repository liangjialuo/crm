package com.zking.crm.base.model;

public class Storage {
    private Integer stkId;

    private Integer prodId;

    private String stkWarehouse;

    private String stkWare;

    private Integer stkCount;

    private String stkMemo;

    public Storage(Integer stkId, Integer prodId, String stkWarehouse, String stkWare, Integer stkCount, String stkMemo) {
        this.stkId = stkId;
        this.prodId = prodId;
        this.stkWarehouse = stkWarehouse;
        this.stkWare = stkWare;
        this.stkCount = stkCount;
        this.stkMemo = stkMemo;
    }

    public Storage() {
        super();
    }

    public Integer getStkId() {
        return stkId;
    }

    public void setStkId(Integer stkId) {
        this.stkId = stkId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse;
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare;
    }

    public Integer getStkCount() {
        return stkCount;
    }

    public void setStkCount(Integer stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo;
    }
}