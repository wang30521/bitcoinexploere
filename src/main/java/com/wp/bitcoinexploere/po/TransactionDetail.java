package com.wp.bitcoinexploere.po;

public class TransactionDetail extends TransactionDetailKey {
    private Byte tsType;

    private Long tsAmount;

    public Byte getTsType() {
        return tsType;
    }

    public void setTsType(Byte tsType) {
        this.tsType = tsType;
    }

    public Long getTsAmount() {
        return tsAmount;
    }

    public void setTsAmount(Long tsAmount) {
        this.tsAmount = tsAmount;
    }
}