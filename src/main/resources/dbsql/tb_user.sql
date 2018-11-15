/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50723
Source Host           : 127.0.0.1:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-15 17:04:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` smallint(6) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '张三', '19', '2018-11-15 16:58:30', null);
INSERT INTO `tb_user` VALUES ('2', '历史', '20', '2018-11-15 16:58:30', null);
INSERT INTO `tb_user` VALUES ('3', '王五', '21', '2018-11-15 16:58:30', null);
INSERT INTO `tb_user` VALUES ('4', '找个', '22', '2018-11-15 16:58:30', null);
INSERT INTO `tb_user` VALUES ('5', '李明', '23', '2018-11-15 16:58:30', null);
