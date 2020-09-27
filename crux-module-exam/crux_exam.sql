/*
 Navicat MySQL Data Transfer

 Source Server         : shenqingwen
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : crux_exam

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 17/09/2020 08:08:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lesson
-- ----------------------------
DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson`  (
  `id` int NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `joinTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lesson
-- ----------------------------
INSERT INTO `lesson` VALUES (1, '信息系统安全与财务知识', '2020-09-10 13:58:10');
INSERT INTO `lesson` VALUES (2, '质量管理体系与EHS体系知识', '2020-09-10 13:58:50');
INSERT INTO `lesson` VALUES (3, '电力系统基础知识', '2020-09-10 13:59:30');
INSERT INTO `lesson` VALUES (4, '企业文化与应知应会考试', '2020-09-10 13:59:48');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `id` int NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 'admi', 'admi');
INSERT INTO `manager` VALUES (2, 'manager', 'manager');
INSERT INTO `manager` VALUES (3, 'execu', 'execu');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `id` int NOT NULL,
  `taoTiId` int NULL DEFAULT NULL,
  `lessonId` int NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `subject` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionA` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionB` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionC` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES (1, 1, 1, '单选题', '嵌入式软件部王某为研发项目出差回来后，需要报销差旅费时选择的单据类型应该是（ ）', 'A.费用报销单', 'B.差旅费报销单', 'C.研发费用（项目用）', 'D.研发差旅费（项目用）', 'D');
INSERT INTO `question` VALUES (2, 4, 2, '单选题', '（）是企业进行生产技术活动的基本依据，是企业标准化体系的核心。', 'A.管理标准', 'B.国家标准', 'C.工作标准', 'D.技术标准', 'D');
INSERT INTO `question` VALUES (3, 3, 4, '单选题', '公司的“五防产品市场”占全国市场的（ ）以上。 ', 'A.40%', 'B.50%', 'C.60%', 'D.65%', 'B');
INSERT INTO `question` VALUES (4, 1, 1, '单选题', '按要求借款一般应当在（ ）天内归还。', 'A.5', 'B.10', 'C.20', 'D.30', 'D');
INSERT INTO `question` VALUES (5, 1, 1, '单选题', '通过IE登录内部邮箱进行收发时，假如按名字“张三”设定的账户，下面哪个登录帐号格式是正确的？（ ）', 'A.zhangsan@ut.cn', 'B.zhangsan', 'C.zhangsan@ut.com', 'D.以上都不正确', 'A');
INSERT INTO `question` VALUES (6, 1, 1, '单选题', '想要企业信息平台能够正常使用，IE要设置什么？（ ）', 'A.兼容性视图的设置', 'B.可信任站点的设置', 'C.弹出窗口阻止程序的设置', 'D.以上都是', 'D');
INSERT INTO `question` VALUES (7, 3, 4, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `question` VALUES (8, 3, 4, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `question` VALUES (9, 3, 4, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `question` VALUES (10, 4, 2, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `question` VALUES (11, 4, 2, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `question` VALUES (12, 4, 2, '单选题', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '123', '小林');
INSERT INTO `student` VALUES (2, '111', '张伟');
INSERT INTO `student` VALUES (3, 'sqw', 'sqw');

-- ----------------------------
-- Table structure for sturesult
-- ----------------------------
DROP TABLE IF EXISTS `sturesult`;
CREATE TABLE `sturesult`  (
  `id` int NOT NULL,
  `studentId` int NULL DEFAULT NULL,
  `taoTiID` int NULL DEFAULT NULL,
  `resSingle` int NULL DEFAULT NULL,
  `resMore` int NULL DEFAULT NULL,
  `resTotal` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sturesult
-- ----------------------------
INSERT INTO `sturesult` VALUES (1, 1, 1, 50, 30, 80);
INSERT INTO `sturesult` VALUES (2, 1, 3, 50, 40, 90);
INSERT INTO `sturesult` VALUES (3, 2, 4, 40, 40, 80);
INSERT INTO `sturesult` VALUES (4, 2, 1, 30, 30, 60);

-- ----------------------------
-- Table structure for taoti
-- ----------------------------
DROP TABLE IF EXISTS `taoti`;
CREATE TABLE `taoti`  (
  `id` int NOT NULL,
  `lessonId` int NULL DEFAULT NULL,
  `nameT` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `joinTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of taoti
-- ----------------------------
INSERT INTO `taoti` VALUES (1, 1, '信息系统安全与财务知识考试', '2020-09-10 15:16:54');
INSERT INTO `taoti` VALUES (2, 3, '电力系统基础知识考试', '2020-09-10 15:18:52');
INSERT INTO `taoti` VALUES (3, 4, '企业文化与应知应会考试', '2020-09-10 15:19:16');
INSERT INTO `taoti` VALUES (4, 2, '质量管理体系与EHS体系知识考试', '2020-09-10 15:20:20');

SET FOREIGN_KEY_CHECKS = 1;
