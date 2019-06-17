package com.wp.bitcoinexploere.api;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BitcoinRestApi", url = "http://localhost:18332")
public interface BitcoinRestApi {

    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainInfo();

    @GetMapping("/rest/block/notxdetails/{blockhash}.json")
    JSONObject getBlockNoTxDetails(@PathVariable String blockhash);

    @GetMapping("/rest/tx/{txHash}.json")
    JSONObject getTransaction(@PathVariable("txHash") String txHash);

    @GetMapping("/rest/block/{blockHash}.json")
    JSONObject getBlock(@PathVariable("blockHash") String blockHash);

    @GetMapping("/rest/getutxos/{txid}-{n}.json")
    JSONObject getUTXO(@PathVariable String txid, @PathVariable Integer n);

    @GetMapping("/rest/getutxos/checkmempool/{txid}-{n}.json")
    JSONObject getUTXOCheckMempool(@PathVariable String txid, @PathVariable Integer n);

    @GetMapping("/rest/headers/{count}/{blockhash}.json")
    List<JSONObject> getBlockHeaders(@PathVariable String blockhash, @PathVariable Integer count);

    @GetMapping("/rest/mempool/info.json")
    JSONObject getMempoolInfo();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getMempoolContents();
}
