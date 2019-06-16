package com.wp.bitcoinexploere.dto;

import java.io.Serializable;
import java.util.Date;

public class BlockListDTO implements Serializable {

    private String blockHash;

    private Integer blockHeight;

    private Date blockTime;

    private Integer blockSize;

    private Long blockSizeOnDisk;

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
}
