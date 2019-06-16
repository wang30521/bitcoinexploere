package com.wp.bitcoinexploere.po;

import java.util.Date;

public class Block {
    private String blockHash;

    private Integer blockHeight;

    private Date blockTime;

    private Integer blockSize;

    private Long blockSizeOnDisk;

    private Double blockDifficult;

    private String prevBlockHash;

    private String nextBlockHash;

    private Double outputTotal;

    private Double transactionFees;

    private String merkleRoot;

    private Integer bcId;

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash == null ? null : blockHash.trim();
    }

    public Integer getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    public Date getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Long getBlockSizeOnDisk() {
        return blockSizeOnDisk;
    }

    public void setBlockSizeOnDisk(Long blockSizeOnDisk) {
        this.blockSizeOnDisk = blockSizeOnDisk;
    }

    public Double getBlockDifficult() {
        return blockDifficult;
    }

    public void setBlockDifficult(Double blockDifficult) {
        this.blockDifficult = blockDifficult;
    }

    public String getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(String prevBlockHash) {
        this.prevBlockHash = prevBlockHash == null ? null : prevBlockHash.trim();
    }

    public String getNextBlockHash() {
        return nextBlockHash;
    }

    public void setNextBlockHash(String nextBlockHash) {
        this.nextBlockHash = nextBlockHash == null ? null : nextBlockHash.trim();
    }

    public Double getOutputTotal() {
        return outputTotal;
    }

    public void setOutputTotal(Double outputTotal) {
        this.outputTotal = outputTotal;
    }

    public Double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(Double transactionFees) {
        this.transactionFees = transactionFees;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot == null ? null : merkleRoot.trim();
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }
}