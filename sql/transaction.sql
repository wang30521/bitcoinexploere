-- ----------------------------
-- Table structure for block_chain
-- ----------------------------

CREATE TABLE `transaction` (
  `tx_id` char(64) NOT NULL,
  `tx_hash` char(64) NOT NULL,
  `block_hash` char(64) NOT NULL,
  `tx_size` bigint(20) NOT NULL,
  `tx_weight` int(11) NOT NULL,
  `tx_time` datetime NOT NULL,
  `total_input` double,
  `total_output` double,
  `fees` double,
  PRIMARY KEY (`tx_id`),
  unique `index_txhash` (`tx_hash`),
  unique `index_blockhash` (`block_hash`),
  unique `index_txtime` (`tx_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
