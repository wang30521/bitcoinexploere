package com.wp.bitcoinexploere.dao;

import com.wp.bitcoinexploere.po.TransactionDetail;
import com.wp.bitcoinexploere.po.TransactionDetailKey;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(TransactionDetailKey key);

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(TransactionDetailKey key);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
}