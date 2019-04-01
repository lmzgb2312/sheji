/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : sheji

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-04-01 10:25:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `laboratory_arrangement`
-- ----------------------------
DROP TABLE IF EXISTS `laboratory_arrangement`;
CREATE TABLE `laboratory_arrangement` (
  `lab_id` int(11) NOT NULL AUTO_INCREMENT,
  `lab_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `lab_teacher` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `lab_instruction` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `lab_start_time` datetime DEFAULT NULL,
  `lab_end_time` datetime DEFAULT NULL,
  `lab_person_amount` int(10) DEFAULT NULL,
  `gmt_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` datetime DEFAULT NULL,
  `lab_person_amount_now` int(10) unsigned zerofill DEFAULT '0000000000',
  `time_period` int(10) DEFAULT NULL,
  PRIMARY KEY (`lab_id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of laboratory_arrangement
-- ----------------------------
INSERT INTO `laboratory_arrangement` VALUES ('56', '成栋楼811', '李四', '111111', '2019-03-04 14:32:21', '2019-03-04 15:00:00', '50', '2019-03-08 14:17:40', null, '0000000000', '10');
INSERT INTO `laboratory_arrangement` VALUES ('57', '成栋楼811', '李四', '11111111111', '2019-02-27 17:49:09', '2019-02-27 19:49:11', '50', '2019-03-08 14:18:00', null, '0000000000', '50');
INSERT INTO `laboratory_arrangement` VALUES ('58', '成栋楼812', '李四', '111111111', '2019-03-07 15:00:00', '2019-03-07 18:00:00', '50', '2019-03-08 14:18:28', null, '0000000000', '50');

-- ----------------------------
-- Table structure for `lab_detail`
-- ----------------------------
DROP TABLE IF EXISTS `lab_detail`;
CREATE TABLE `lab_detail` (
  `lab_detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `lab_detail_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `lab_detail_teacher` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `lab_detail_instruction` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `gmt_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`lab_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of lab_detail
-- ----------------------------
INSERT INTO `lab_detail` VALUES ('15', '成栋楼811', '李四', '实验室1', '2019-03-06 10:22:35');
INSERT INTO `lab_detail` VALUES ('16', '成栋楼812', '李四', '实验室2', '2019-03-01 13:37:17');
INSERT INTO `lab_detail` VALUES ('17', '成栋楼813', '王五', '实验室3', '2019-03-01 13:37:32');
INSERT INTO `lab_detail` VALUES ('18', '成栋楼820', '王五', '111', '2019-03-04 14:46:26');
INSERT INTO `lab_detail` VALUES ('19', '成栋楼826', '11', '111', '2019-03-04 15:22:13');
INSERT INTO `lab_detail` VALUES ('20', '成栋楼828', '王五', '333', '2019-03-07 10:55:35');

-- ----------------------------
-- Table structure for `lab_extend_info`
-- ----------------------------
DROP TABLE IF EXISTS `lab_extend_info`;
CREATE TABLE `lab_extend_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lab_extend_name` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `lab_extend_teacher` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `lab_extend_start_time` datetime DEFAULT NULL,
  `lab_extend_end_time` datetime DEFAULT NULL,
  `lab_extend_period_time` int(10) DEFAULT NULL,
  `gmt_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `gmt_modified` datetime DEFAULT NULL,
  `lab_extend_amount` int(10) DEFAULT NULL,
  `lab_extend_current` int(10) unsigned zerofill DEFAULT '0000000000',
  `uid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=523 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of lab_extend_info
-- ----------------------------
INSERT INTO `lab_extend_info` VALUES ('516', '成栋楼811', '李四', '2019-02-27 17:49:09', '2019-02-27 18:39:09', '50', '2019-03-26 14:08:29', null, '50', '0000000004', '57');
INSERT INTO `lab_extend_info` VALUES ('517', '成栋楼811', '李四', '2019-02-27 18:49:09', '2019-02-27 19:39:09', '50', '2019-03-20 16:52:33', null, '50', '0000000003', '57');
INSERT INTO `lab_extend_info` VALUES ('519', '成栋楼812', '李四', '2019-03-07 15:00:00', '2019-03-07 15:50:00', '50', '2019-03-14 19:00:41', null, '50', '0000000002', '58');
INSERT INTO `lab_extend_info` VALUES ('520', '成栋楼812', '李四', '2019-03-07 16:00:00', '2019-03-07 16:50:00', '50', '2019-03-20 16:52:41', null, '50', '0000000002', '58');
INSERT INTO `lab_extend_info` VALUES ('521', '成栋楼812', '李四', '2019-03-07 17:00:00', '2019-03-07 17:50:00', '50', '2019-03-20 16:52:45', null, '50', '0000000003', '58');

-- ----------------------------
-- Table structure for `lab_reservation`
-- ----------------------------
DROP TABLE IF EXISTS `lab_reservation`;
CREATE TABLE `lab_reservation` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `lab_name` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '实验室名称',
  `start_time` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '开始时间',
  `end_time` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '结束时间',
  `lab_teacher` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '任课老师',
  `lab_current` int(10) DEFAULT NULL COMMENT '当前人数',
  `lab_max` int(10) DEFAULT NULL COMMENT '最大人数',
  `student_name` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '学生姓名',
  `student_id` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '学生学号',
  `lab_id` int(10) DEFAULT NULL COMMENT '选择实验室主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of lab_reservation
-- ----------------------------
INSERT INTO `lab_reservation` VALUES ('8', '成栋楼811', null, null, '李四', '4', '50', '111', '2015211162', '516');
INSERT INTO `lab_reservation` VALUES ('9', '成栋楼811', null, null, '李四', '3', '50', '111', '2015211162', '517');
INSERT INTO `lab_reservation` VALUES ('10', '成栋楼812', null, null, '李四', '2', '50', '111', '2015211162', '520');
INSERT INTO `lab_reservation` VALUES ('11', '成栋楼812', '2019-03-07 17:00:00.0', '2019-03-07 17:50:00.0', '李四', '3', '50', '111', '2015211162', '521');
INSERT INTO `lab_reservation` VALUES ('15', '成栋楼812', '2019-03-07 15:00:00.0', '2019-03-07 15:50:00.0', '李四', '2', '50', '111', '2015211162', '519');
INSERT INTO `lab_reservation` VALUES ('16', '成栋楼811', '2019-02-27 17:49:09.0', '2019-02-27 18:39:09.0', '李四', '4', '50', '111', '2015211163', '516');
INSERT INTO `lab_reservation` VALUES ('17', '成栋楼811', '2019-02-27 18:49:09.0', '2019-02-27 19:39:09.0', '李四', '3', '50', '111', '2015211163', '517');
INSERT INTO `lab_reservation` VALUES ('18', '成栋楼812', '2019-03-07 16:00:00.0', '2019-03-07 16:50:00.0', '李四', '2', '50', '111', '2015211163', '520');
INSERT INTO `lab_reservation` VALUES ('19', '成栋楼812', '2019-03-07 17:00:00.0', '2019-03-07 17:50:00.0', '李四', '3', '50', '111', '2015211163', '521');
INSERT INTO `lab_reservation` VALUES ('20', '成栋楼811', '2019-02-27 17:49:09.0', '2019-02-27 18:39:09.0', '李四', '4', '50', '111', '123456', '516');

-- ----------------------------
-- Table structure for `login_permissions`
-- ----------------------------
DROP TABLE IF EXISTS `login_permissions`;
CREATE TABLE `login_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `person_name` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '登录人员姓名',
  `person_right` int(11) DEFAULT NULL COMMENT '权限 管理员-1 学生-2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of login_permissions
-- ----------------------------
INSERT INTO `login_permissions` VALUES ('1', '2015211162', '123456', '李明哲', '2');
INSERT INTO `login_permissions` VALUES ('2', '123456', '123456', '张三', '2');

-- ----------------------------
-- Table structure for `personal_information`
-- ----------------------------
DROP TABLE IF EXISTS `personal_information`;
CREATE TABLE `personal_information` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '学生姓名',
  `student_id` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '学号',
  `student_password` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `gender` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
  `college` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '学院',
  `major` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '专业',
  `contact` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '联系方式',
  `email` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `tutor` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '指导教师',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of personal_information
-- ----------------------------
INSERT INTO `personal_information` VALUES ('1', '李明哲', '2015211162', '123456', '男', '机电工程学院', '通信工程', '15663681886', '601856407@qq.com', '刘嘉新');
