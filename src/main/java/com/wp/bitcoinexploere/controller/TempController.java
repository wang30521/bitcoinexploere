package com.wp.bitcoinexploere.controller;

import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.api.BitcoinJsonRpcApi;
import com.wp.bitcoinexploere.api.BitcoinRestApi;
import com.wp.bitcoinexploere.dao.BlockMapper;
import com.wp.bitcoinexploere.po.Block;
import com.wp.bitcoinexploere.service.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
@CrossOrigin
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @Autowired
    private BlockMapper blockMapper;

    @Autowired
    private BitcoinService bitcoinService;

    @GetMapping("/test")
    public String test(){
        //JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
      //  JSONObject blockNoTxDetails = bitcoinRestApi.getBlockNoTxDetails("00000000000ed3139372c0b8449f0fb1778b128f247546a551316edf5e531fb7");

        //        JSONObject blockchainInfo = bitcoinJsonRpcApi.getBlockchainInfo();
        //         JSONObject block = bitcoinJsonRpcApi.getBlockByHash("000000000000025f54e531a47239f394e6a7f07af3b9761f279cb86c5884d763");
        //        JSONObject transaction = bitcoinJsonRpcApi.getTransactionById("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf");

        //JSONObject utxo = bitcoinRestApi.getUTXO("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf", 0);
       // JSONObject utxoCheckMempool = bitcoinRestApi.getUTXOCheckMempool("0b9a0ea6c034834e79db101967985e1b0d6358cad111444ff52075106acba8d6", 0);

        String tempBlockhash = "000000000933ea01ad0ee984209779baaec3ced90fa3f408719526f8d77f4943";
        bitcoinService.syncBlock(tempBlockhash);
       /* while (tempBlockhash !=null && tempBlockhash.isEmpty()){
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


        }*/


        return null;

    }
}
