package com.wp.bitcoinexploere.dto;

import java.io.Serializable;
import java.util.Date;

public class BlockGetDTO implements Serializable {
    private String blockHash;

    private Integer blockHeight;

    private Long blockTime;

    private Integer blockSize;

    private Long blockSizeOnDisk;

    private Double blockDifficult;

    private String prevBlockHash;

    private String nextBlockHash;

    private Double outputTotals;

    private Double transactionFees;

    private String merkleRoot;



    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public Integer getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    public Long getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Long blockTime) {
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
        this.prevBlockHash = prevBlockHash;
    }

    public String getNextBlockHash() {
        return nextBlockHash;
    }

    public void setNextBlockHash(String nextBlockHash) {
        this.nextBlockHash = nextBlockHash;
    }

    public Double getOutputTotals() {
        return outputTotals;
    }

    public void setOutputTotals(Double outputTotals) {
        this.outputTotals = outputTotals;
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
        this.merkleRoot = merkleRoot;
    }


}
