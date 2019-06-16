package com.wp.bitcoinexploere.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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


    @GetMapping("/rest/headers/{count}/{blockHash}.json")
    JSONArray getBlockHeaders(@PathVariable("count") Integer count, @PathVariable("blockHash") String blockHash);

    @GetMapping("/rest/mempool/info.json")
    JSONObject getMempoolInfo();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getMempoolContents();
}
