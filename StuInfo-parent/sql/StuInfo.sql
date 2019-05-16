DROP DATABASE IF EXISTS info;
CREATE DATABASE info DEFAULT CHARACTER SET utf8;;
USE info;

DROP TABLE IF EXISTS student;
CREATE TABLE student(
	s_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT'学生id',
	s_name VARCHAR(255) NOT NULL COMMENT'学生姓名',
	s_birthday DATETIME NOT NULL COMMENT'学生生日',
	s_gender VARCHAR(255) NOT NULL COMMENT'学生电话',
	s_telephone VARCHAR(255) NOT NULL COMMENT'学生性别',
	s_email VARCHAR(255) NOT NULL COMMENT'学生i邮箱',
	classId INT(10) NOT NULL COMMENT'学生所在班级id'
);

DROP TABLE IF EXISTS classes;
CREATE TABLE classes(
	c_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT'班级id',
	c_name VARCHAR(255) NOT NULL COMMENT'班级名'
);

INSERT INTO classes VALUES(DEFAULT,'S111'),(DEFAULT,'S1112'),(DEFAULT,'S1113'),(DEFAULT,'S1114'),(DEFAULT,'S1115');
INSERT INTO student VALUES(DEFAULT,'tom','1999-01-01','男','123456789','123@qq.com',1),
(DEFAULT,'ann','1993-05-14','女','123456789','127@qq.com',2),
(DEFAULT,'李磊','1992-01-30','男','125556789','120@qq.com',3),
(DEFAULT,'丽丽','1995-12-01','女','123245789','122@qq.com',4),
(DEFAULT,'杨过','1997-01-01','男','12278789','121@qq.com',5);