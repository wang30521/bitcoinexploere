package com.wp.bitcoinexploere.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.List;

public interface BitcoinService {
    void syncBlock(String blockhash);

    void syncTx(JSONObject txJson, String blockhash, Date time, Integer confirmations);

    void syncTxDetail(JSONObject txJson);

    void syncTxDetailVout(JSONArray vouts);

    void syncTxDetailVin(JSONArray vins);

}
