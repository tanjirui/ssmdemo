create database ssmdemo;

DROP TABLE IF EXISTS `t_user`;  
CREATE TABLE `t_user` (  
  `user_id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(20) NOT NULL,  
  `user_age` varchar(20) NOT NULL,  
  PRIMARY KEY (`user_id`)  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8  ROW_FORMAT=COMPACT;  


--访问地址:http://127.0.0.1:8080/ssmdemo/index.jsp