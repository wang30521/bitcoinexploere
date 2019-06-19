package com.wp.bitcoinexploere.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wp.bitcoinexploere.dao.BlockMapper;
import com.wp.bitcoinexploere.dto.BlockListDTO;
import com.wp.bitcoinexploere.po.Block;
import com.wp.bitcoinexploere.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockServiceImpl implements BlockService {
    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<BlockListDTO> getRecentBlocks() {
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();
        List<Block> blocks = blockMapper.selectRecentBlocks();
        for(Block block:blocks){
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setBlockHash(block.getBlockHash());
            blockListDTO.setBlockHeight(block.getBlockHeight());
            blockListDTO.setBlockTime(block.getBlockTime().getTime());
            blockListDTO.setBlockSizeOnDisk(block.getBlockSizeOnDisk());
            blockListDTO.setBlockSize(block.getBlockSize());
            blockListDTOS.add(blockListDTO);


        }

        return blockListDTOS;
    }
}
