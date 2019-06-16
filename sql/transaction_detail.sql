-- ----------------------------
-- Table structure for block_chain
-- ----------------------------

CREATE TABLE `transaction_detail` (
  `tx_id` char(64) NOT NULL,
  `ts_address` varchar(70) NOT NULL,
  `ts_type` tinyint NOT NULL,
  `ts_amount` bigint(20) NOT NULL,
  PRIMARY KEY (`tx_id`, `ts_address`),
  index `index_tsaddress` (`ts_address`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
