CREATE DATABASE IF NOT EXISTS `contact_sys` default charset utf8 COLLATE utf8_general_ci;

USE `contact_sys`;
SET FOREIGN_KEY_CHECKS=0;
drop TABLE if EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `create_time` varchar(30) DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户';


drop TABLE if EXISTS `contact`;
CREATE TABLE IF NOT EXISTS `contact` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `sex` int(11) DEFAULT NULL COMMENT '性别',
 `head_img` varchar(200) DEFAULT NULL COMMENT '头像',
 `celphone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
 `address` varchar(255) DEFAULT NULL COMMENT '住址',
 `remark` varchar(255) DEFAULT NULL COMMENT '备注',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
 `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
KEY `contact_user_id_ref` (`user_id`),
CONSTRAINT `contact_user_id_ref` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='联系人';


drop TABLE if EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='管理员';



INSERT INTO `contact_sys`.`user` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`create_time`)  VALUES('1','user','123','姓名0','13052653265','2024-10-23 21:18:28');
INSERT INTO `contact_sys`.`user` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`create_time`)  VALUES('2','user1','123','姓名1','13553613261','2024-10-24 21:18:28');
INSERT INTO `contact_sys`.`user` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`create_time`)  VALUES('3','user2','123','姓名2','13552623265','2024-10-23 21:18:28');
INSERT INTO `contact_sys`.`user` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`create_time`)  VALUES('4','user3','123','姓名3','13052623165','2024-10-23 21:18:28');
INSERT INTO `contact_sys`.`user` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`create_time`)  VALUES('5','user4','123','姓名4','13052633163','2024-10-24 21:18:28');
INSERT INTO `contact_sys`.`contact` (`id`,`name`,`sex`,`head_img`,`celphone`,`email`,`address`,`remark`,`create_time`,`user_id`)  VALUES('1','姓名0','1','http://localhost:8080/contact_sys/static/images/1/1.jpg','13052653265','45236185@qq.com','住址0','备注0','2024-10-23 21:18:28','5');
INSERT INTO `contact_sys`.`contact` (`id`,`name`,`sex`,`head_img`,`celphone`,`email`,`address`,`remark`,`create_time`,`user_id`)  VALUES('2','姓名1','2','http://localhost:8080/contact_sys/static/images/1/2.jpg','13553613261','8523005@qq.com','住址1','备注1','2024-10-24 21:18:28','3');
INSERT INTO `contact_sys`.`contact` (`id`,`name`,`sex`,`head_img`,`celphone`,`email`,`address`,`remark`,`create_time`,`user_id`)  VALUES('3','姓名2','1','http://localhost:8080/contact_sys/static/images/1/3.jpg','13552623265','45236185@qq.com','住址2','备注2','2024-10-23 21:18:28','2');
INSERT INTO `contact_sys`.`contact` (`id`,`name`,`sex`,`head_img`,`celphone`,`email`,`address`,`remark`,`create_time`,`user_id`)  VALUES('4','姓名3','2','http://localhost:8080/contact_sys/static/images/1/4.jpg','13052623165','655236785@qq.com','住址3','备注3','2024-10-23 21:18:28','3');
INSERT INTO `contact_sys`.`contact` (`id`,`name`,`sex`,`head_img`,`celphone`,`email`,`address`,`remark`,`create_time`,`user_id`)  VALUES('5','姓名4','2','http://localhost:8080/contact_sys/static/images/1/5.jpg','13052633163','83838888@qq.com','住址4','备注4','2024-10-23 21:18:28','5');
INSERT INTO `contact_sys`.`admin` (`id`,`login_name`,`password`)  VALUES('1','admin','123');
INSERT INTO `contact_sys`.`admin` (`id`,`login_name`,`password`)  VALUES('2','admin1','123');
INSERT INTO `contact_sys`.`admin` (`id`,`login_name`,`password`)  VALUES('3','admin2','123');
INSERT INTO `contact_sys`.`admin` (`id`,`login_name`,`password`)  VALUES('4','admin3','123');
INSERT INTO `contact_sys`.`admin` (`id`,`login_name`,`password`)  VALUES('5','admin4','123');