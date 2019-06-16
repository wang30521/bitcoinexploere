package com.wp.bitcoinexploere.po;

public class TransactionDetailKey {
    private String txId;

    private String tsAddress;

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId == null ? null : txId.trim();
    }

    public String getTsAddress() {
        return tsAddress;
    }

    public void setTsAddress(String tsAddress) {
        this.tsAddress = tsAddress == null ? null : tsAddress.trim();
    }
}