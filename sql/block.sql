-- ----------------------------
-- Table structure for block_chain
-- ----------------------------

CREATE TABLE `block` (
  `block_hash` varchar(70) NOT NULL,
  `block_height` int(11) NOT NULL,
  `block_time` datetime NOT NULL,
  `block_size` int(11) NOT NULL,
  `block_size_on_disk` bigint(20) NOT NULL,
  `block_difficult` double NOT NULL NOT NULL,
  `prev_block_hash` varchar(50),
  `next_block_hash` varchar(50),
  `output_total` double,
  `transaction_fees` double,
  `merkle_root` varchar(70),
  `bc_id` int(11) NOT NULL,
  PRIMARY KEY (`block_hash`),
  unique `index_bcid_height` (`bc_id`, `block_height`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
