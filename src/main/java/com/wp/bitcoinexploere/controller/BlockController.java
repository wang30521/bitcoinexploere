package com.wp.bitcoinexploere.controller;

import com.wp.bitcoinexploere.dto.BlockGetDTO;
import com.wp.bitcoinexploere.dto.BlockListDTO;
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

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks(){
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlockHash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockListDTO.setBlockHeight(580644);
        blockListDTO.setBlockTime(new Date());
        blockListDTO.setBlockSizeOnDisk((long) 2390);
        blockListDTO.setBlockSize(1257767);
        blockListDTOS.add(blockListDTO);

        BlockListDTO blockListDTO2 = new BlockListDTO();
        blockListDTO2.setBlockHash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockListDTO2.setBlockHeight(580643);
        blockListDTO2.setBlockTime(new Date());
        blockListDTO2.setBlockSizeOnDisk((long) 2702);
        blockListDTO2.setBlockSize(1322496);
        blockListDTOS.add(blockListDTO2);

        return blockListDTOS;
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
