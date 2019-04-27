DROP DATABASE IF EXISTS edoc;
CREATE DATABASE edoc;
USE edoc;

DROP TABLE IF EXISTS edoc_category;
CREATE TABLE edoc_category(
	id INT(4) PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL
);
INSERT INTO edoc_category VALUES(DEFAULT,'计算机'),
(DEFAULT,'地理'),
(DEFAULT,'旅游'),
(DEFAULT,'历史'),
(DEFAULT,'烹饪');

DROP TABLE IF EXISTS edoc_entry;
CREATE TABLE edoc_entry(
	id INT(4) PRIMARY KEY AUTO_INCREMENT,
	categoryid INT(4) NOT NULL,
	title VARCHAR(50) NOT NULL,
	summmary VARCHAR(100),
	uploader VARCHAR(50),
	createDate DATETIME 
);

INSERT INTO edoc_entry VALUES(DEFAULT,1,'SSM轻量级框架','SSM框架的使用','张三',NOW()),
(DEFAULT,2,'地球的起源','带你深入了解地球的今生前世','李四',NOW()),
(DEFAULT,3,'10天玩转欧洲','穷游欧洲之选','张三',NOW()),
(DEFAULT,4,'探秘明朝','探秘明朝的隐秘','王五',NOW()),
(DEFAULT,5,'地狱厨房','让你迅速成为五星级大厨','李磊',NOW());