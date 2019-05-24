/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : bubble_cloud

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-05-24 16:31:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_micro_service_info
-- ----------------------------
DROP TABLE IF EXISTS `tbl_micro_service_info`;
CREATE TABLE `tbl_micro_service_info` (
  `id` bigint(24) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `author` varchar(255) NOT NULL,
  `version` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tbl_micro_service_info
-- ----------------------------
INSERT INTO `tbl_micro_service_info` VALUES ('0', 'test_micro_service', '', '1.0.0');

-- ----------------------------
-- Table structure for tbl_micro_service_interface
-- ----------------------------
DROP TABLE IF EXISTS `tbl_micro_service_interface`;
CREATE TABLE `tbl_micro_service_interface` (
  `id` bigint(24) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `request_type` varchar(255) DEFAULT NULL,
  `request_header` varchar(255) DEFAULT NULL,
  `request_body` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tbl_micro_service_interface
-- ----------------------------
