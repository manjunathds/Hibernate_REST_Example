CREATE TABLE `emp_det` (
  `sl_no` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NOT NULL,
  `emp_ctc` decimal(16,2) DEFAULT NULL,
  `emp_pf_amt` decimal(16,2) DEFAULT NULL,
  `emp_tax_amt` decimal(16,2) DEFAULT NULL,
  PRIMARY KEY (`sl_no`),
  KEY `EMP_ID_idx` (`emp_id`),
  CONSTRAINT `EMP_ID` FOREIGN KEY (`emp_id`) REFERENCES `emp_mstr` (`sl_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8