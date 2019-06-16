package com.wp.bitcoinexploere.po;

import java.util.Date;

public class Transaction {
    private String txId;

    private String txHash;

    private String blockHash;

    private Long txSize;

    private Integer txWeight;

    private Date txTime;

    private Double totalInput;

    private Double totalOutput;

    private Double fees;

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId == null ? null : txId.trim();
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash == null ? null : blockHash.trim();
    }

    public Long getTxSize() {
        return txSize;
    }

    public void setTxSize(Long txSize) {
        this.txSize = txSize;
    }

    public Integer getTxWeight() {
        return txWeight;
    }

    public void setTxWeight(Integer txWeight) {
        this.txWeight = txWeight;
    }

    public Date getTxTime() {
        return txTime;
    }

    public void setTxTime(Date txTime) {
        this.txTime = txTime;
    }

    public Double getTotalInput() {
        return totalInput;
    }

    public void setTotalInput(Double totalInput) {
        this.totalInput = totalInput;
    }

    public Double getTotalOutput() {
        return totalOutput;
    }

    public void setTotalOutput(Double totalOutput) {
        this.totalOutput = totalOutput;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
}