package com.wp.bitcoinexploere.service;

import com.wp.bitcoinexploere.dto.BlockListDTO;

import java.util.List;

public interface BlockService {

    List<BlockListDTO> getRecentBlocks();
}
