package com.wp.bitcoinexploere.dao;

import com.wp.bitcoinexploere.po.Transaction;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txId);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txId);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);
}