package com.wp.bitcoinexploere.dao;

import com.wp.bitcoinexploere.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockHash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockHash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    //custom
    List<Block> selectRecentBlocks();
}