CREATE TABLE `emp_mstr` (
  `sl_no` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` varchar(45) NOT NULL,
  `emp_firstName` varchar(20) DEFAULT NULL,
  `emp_lastName` varchar(20) DEFAULT NULL,
  `emp_dept` varchar(45) DEFAULT NULL,
  `emp_group` varchar(10) DEFAULT NULL,
  `emp_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sl_no`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8