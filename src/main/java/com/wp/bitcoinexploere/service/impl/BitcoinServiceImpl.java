package com.wp.bitcoinexploere.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.api.BitcoinRestApi;
import com.wp.bitcoinexploere.dao.BlockMapper;
import com.wp.bitcoinexploere.po.Block;
import com.wp.bitcoinexploere.service.BitcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class BitcoinServiceImpl implements BitcoinService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BlockMapper blockMapper;

@Autowired
private BitcoinRestApi bitcoinRestApi;
    @Override
    public void syncBlock(String blockhash) {
        logger.info("begin to sync block from {}",blockhash);

        String tempBlockhash = blockhash;
        while (tempBlockhash !=null && tempBlockhash.isEmpty()){
            JSONObject blockJson = bitcoinRestApi.getBlock(tempBlockhash);
            Block block = new Block();
            block.setBlockHash(blockJson.getString("hash"));
            block.setBlockHeight(blockJson.getInteger("height"));
            Long time = blockJson.getLong("time");
            block.setBlockTime(new Date(time * 1000));
            block.setBlockSizeOnDisk(blockJson.getLong("nTx"));
            block.setBlockSize(blockJson.getInteger("size"));
            block.setBlockDifficult(blockJson.getDouble("difficulty"));
            block.setPrevBlockHash(blockJson.getString("previousblockhash"));
            block.setNextBlockHash(blockJson.getString("nextblockhash"));

            blockMapper.insert(block);
            tempBlockhash = block.getNextBlockHash();


        }
        logger.info("end sync block");
    }
}
