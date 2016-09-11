/*
Navicat MySQL Data Transfer

Source Server         : local-win10
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : accounting

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2016-09-11 10:40:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for acc_consume_type
-- ----------------------------
DROP TABLE IF EXISTS `acc_consume_type`;
CREATE TABLE `acc_consume_type` (
  `ACC_CONSUME_TYPE_ID` int(50) NOT NULL AUTO_INCREMENT,
  `TYPE_CODE` int(50) NOT NULL COMMENT '消费-支出类型代码',
  `TYPE_NAME` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '消费支出类型名',
  `TYPE_DESC` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型描述',
  PRIMARY KEY (`ACC_CONSUME_TYPE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of acc_consume_type
-- ----------------------------
INSERT INTO `acc_consume_type` VALUES ('1', '1', '餐饮', '餐饮');
INSERT INTO `acc_consume_type` VALUES ('2', '2', '医疗', '医疗');
INSERT INTO `acc_consume_type` VALUES ('3', '3', '交通', '交通');
INSERT INTO `acc_consume_type` VALUES ('4', '4', '副食水果', '副食水果');
INSERT INTO `acc_consume_type` VALUES ('5', '5', '其它', '其它');
INSERT INTO `acc_consume_type` VALUES ('6', '6', '自定义', '自定义');
INSERT INTO `acc_consume_type` VALUES ('7', '7', '罚款', '罚款');
INSERT INTO `acc_consume_type` VALUES ('8', '8', 'fjaoisjfdaoijf', 'hahah');
INSERT INTO `acc_consume_type` VALUES ('9', '8', 'fjaoisjfdaoijf', 'hahah');

-- ----------------------------
-- Table structure for acc_money_type
-- ----------------------------
DROP TABLE IF EXISTS `acc_money_type`;
CREATE TABLE `acc_money_type` (
  `ACC_MONEY_TYPE_ID` int(50) NOT NULL AUTO_INCREMENT,
  `TYPE_CODE` int(50) NOT NULL COMMENT '记账类型编码',
  `TYPE_NAME` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '记账类型名',
  `TYPE_DESC` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ACC_MONEY_TYPE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of acc_money_type
-- ----------------------------
INSERT INTO `acc_money_type` VALUES ('1', '1', '支出', '消费支出');
INSERT INTO `acc_money_type` VALUES ('2', '2', '收入', '后入');
INSERT INTO `acc_money_type` VALUES ('3', '3', '借出', '借出');
INSERT INTO `acc_money_type` VALUES ('4', '4', '借入', '借入');

-- ----------------------------
-- Table structure for acc_transaction
-- ----------------------------
DROP TABLE IF EXISTS `acc_transaction`;
CREATE TABLE `acc_transaction` (
  `ACC_TRANSACTION_ID` int(50) NOT NULL,
  `CREATE_TIME` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `MONEY_TYPE` int(50) NOT NULL,
  `SUB_TYPE` int(50) NOT NULL DEFAULT '0',
  `AMOUNT` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '消费金额',
  `DESC` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ACC_TRANSACTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of acc_transaction
-- ----------------------------

-- ----------------------------
-- Table structure for acc_user
-- ----------------------------
DROP TABLE IF EXISTS `acc_user`;
CREATE TABLE `acc_user` (
  `ACC_USER_ID` int(50) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `USER_ID_CARD_NO` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `GENDER` tinyint(10) DEFAULT NULL,
  `AGE` int(50) DEFAULT NULL,
  `PHONE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PHOTO` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ALIAS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ACC_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of acc_user
-- ----------------------------
