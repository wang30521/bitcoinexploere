package com.wp.bitcoinexploere.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public interface BitcoinService {
    void syncBlock(String blockhash);

    void syncTx(JSONObject txJson, String blockhash, Date time, Integer confirmations);

}
