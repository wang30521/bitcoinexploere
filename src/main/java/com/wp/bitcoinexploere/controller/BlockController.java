package com.wp.bitcoinexploere.controller;

import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.api.BitcoinJsonRpcApi;
import com.wp.bitcoinexploere.api.BitcoinRestApi;
import com.wp.bitcoinexploere.dto.BlockGetDTO;
import com.wp.bitcoinexploere.dto.BlockListDTO;
import com.wp.bitcoinexploere.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @Autowired
    private BlockService blockService;

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks() throws Throwable {


       /* BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlockHash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockListDTO.setBlockHeight(580644);
        blockListDTO.setBlockTime(new Date());
        blockListDTO.setBlockSizeOnDisk((long) 2390);
        blockListDTO.setBlockSize(1257767);
        blockListDTOS.add(blockListDTO);*/

     /*  JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
        Integer blockHeight = blockChainInfo.getInteger("blocks");
        Integer blockFromHeight = blockHeight-5;

        String blockhash = bitcoinJsonRpcApi.getBlockhashByHeight(blockFromHeight);

        List<JSONObject> blockHeaders = bitcoinRestApi.getBlockHeaders( 5,blockhash);*/

        List<BlockListDTO> recentBlocks = blockService.getRecentBlocks()

        return recentBlocks;
    }

    @GetMapping("/getByBlockhash")
    public BlockGetDTO getByBlockhash(@RequestParam String blockHash){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockHash("00000000000000000019ee09aeaa3004fb1c089bee625e4a67d9dcd23e7e8833");
        blockGetDTO.setBlockHeight(580980);
        blockGetDTO.setBlockTime(new Date().getTime());
        blockGetDTO.setBlockSize(1253997);
        blockGetDTO.setBlockSizeOnDisk((long) 2433);
        blockGetDTO.setBlockDifficult(7409399249090.25);
        blockGetDTO.setPrevBlockHash("00000000000000000011e175cb81ce01c92cc7bb0e908b2065f6ef52598be500");
        blockGetDTO.setNextBlockHash("0000000000000000001f1c6fbb49e1200577f453e5a47dbff26e1d7d269141eb");
        blockGetDTO.setOutputTotals(11010.228023);
        blockGetDTO.setTransactionFees(0.68488396);
        blockGetDTO.setMerkleRoot("39b01d9b3231ce927ca7a3354bf13748e848cb8d8492b545cd8ff1226ba1da7f");

        return blockGetDTO;
    }

    @GetMapping("/getByHeight")
    public BlockGetDTO getByHeight(@RequestParam Integer blockHeight){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockHash("00000000000000000019ee09aeaa3004fb1c089bee625e4a67d9dcd23e7e8833");
        blockGetDTO.setBlockHeight(580980);
        blockGetDTO.setBlockTime(new Date().getTime());
        blockGetDTO.setBlockSize(1253997);
        blockGetDTO.setBlockSizeOnDisk((long) 2433);
        blockGetDTO.setBlockDifficult(7409399249090.25);
        blockGetDTO.setPrevBlockHash("00000000000000000011e175cb81ce01c92cc7bb0e908b2065f6ef52598be500");
        blockGetDTO.setNextBlockHash("0000000000000000001f1c6fbb49e1200577f453e5a47dbff26e1d7d269141eb");
        blockGetDTO.setOutputTotals(11010.228023);
        blockGetDTO.setTransactionFees(0.68488396);
        blockGetDTO.setMerkleRoot("39b01d9b3231ce927ca7a3354bf13748e848cb8d8492b545cd8ff1226ba1da7f");

        return blockGetDTO;
    }
}
