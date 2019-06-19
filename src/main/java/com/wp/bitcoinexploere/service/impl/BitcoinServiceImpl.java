package com.wp.bitcoinexploere.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.api.BitcoinRestApi;
import com.wp.bitcoinexploere.dao.BlockMapper;
import com.wp.bitcoinexploere.dao.TransactionMapper;
import com.wp.bitcoinexploere.po.Block;
import com.wp.bitcoinexploere.po.Transaction;
import com.wp.bitcoinexploere.service.BitcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

public class BitcoinServiceImpl implements BitcoinService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BlockMapper blockMapper;

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private TransactionMapper transactionMapper;

    @Override
    @Async
    @Transactional
    public void syncBlock(String blockhash) {
        logger.info("begin to sync block from {}",blockhash);

        String tempBlockhash = blockhash;
        while (tempBlockhash !=null && tempBlockhash.isEmpty()){
            JSONObject blockJson = bitcoinRestApi.getBlock(tempBlockhash);
            Block block = new Block();
            block.setBlockHash(blockJson.getString("hash"));
            block.setBlockHeight(blockJson.getInteger("height"));
            Long timestamp = blockJson.getLong("time");
            Date time = new Date(timestamp * 1000);
            block.setBlockTime(time);
            block.setBlockSizeOnDisk(blockJson.getLong("nTx"));
            block.setBlockSize(blockJson.getInteger("size"));
            block.setBlockDifficult(blockJson.getDouble("difficulty"));
            block.setPrevBlockHash(blockJson.getString("previousblockhash"));
            block.setNextBlockHash(blockJson.getString("nextblockhash"));
            Integer confirmations = blockJson.getInteger("confirmations");
            blockMapper.insert(block);

            //todo sync txes
            JSONArray txesArray = blockJson.getJSONArray("tx");
            List<JSONObject> txesList = txesArray.toJavaList(JSONObject.class);


            for(Object txObj :txesArray){
                JSONObject jsonObject = new JSONObject((LinkedHashMap) txObj);
                syncTx(jsonObject,tempBlockhash,time,confirmations);
            }



            tempBlockhash = block.getNextBlockHash();


        }
        logger.info("end sync block");
    }

    @Override
    public void syncTx(JSONObject txJson, String blockhash, Date time, Integer confirmations) {
        Transaction tx = new Transaction();
        tx.setTxHash(txJson.getString("txid"));
        tx.setBlockHash(blockhash);
        tx.setTxTime(time);
        //todo set tx amount
        tx.setTxSize(txJson.getLong("size"));
        tx.setTxWeight(txJson.getInteger("weight"));
        //todo set tx confirmations
        transactionMapper.insert(tx);


    }
}
