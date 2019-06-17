package com.wp.bitcoinexploere.controller;

import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
@CrossOrigin
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @GetMapping("/test")
    public String test(){
       // JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
        //        JSONObject blockNoTxDetails = bitcoinRestApi.getBlockNoTxDetails("00000000000ed3139372c0b8449f0fb1778b128f247546a551316edf5e531fb7");

        //        JSONObject blockchainInfo = bitcoinJsonRpcApi.getBlockchainInfo();
        //         JSONObject block = bitcoinJsonRpcApi.getBlockByHash("000000000000025f54e531a47239f394e6a7f07af3b9761f279cb86c5884d763");
        //        JSONObject transaction = bitcoinJsonRpcApi.getTransactionById("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf");

        JSONObject utxo = bitcoinRestApi.getUTXO("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf", 0);
        JSONObject utxoCheckMempool = bitcoinRestApi.getUTXOCheckMempool("0b9a0ea6c034834e79db101967985e1b0d6358cad111444ff52075106acba8d6", 0);

        return null;
    }
}
