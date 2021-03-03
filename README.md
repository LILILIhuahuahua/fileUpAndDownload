# fileUpAndDownload

本项目为项目是基于**SSM与SpringBoot**开发的web项目，支持**登陆**、**文件上传下载**、**在线预览**等功能。

适合刚学习**SSM或SpringBoot**的同学完成的小项目。



## 界面展示

### 一、用户登陆界面

![image-20210303170842015](D:%5CCode%5CJava%5CJavaProject%5Cfiles%5CREADME.assets%5Cimage-20210303170842015.png)



### 二、文件展示与上传下载页面

![image-20210303170859441](D:%5CCode%5CJava%5CJavaProject%5Cfiles%5CREADME.assets%5Cimage-20210303170859441.png)



## 数据库建表语句

```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_files
-- ----------------------------
DROP TABLE IF EXISTS `t_files`;
CREATE TABLE `t_files` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `oldFileName` varchar(200) DEFAULT NULL,
  `newFileName` varchar(300) DEFAULT NULL,
  `ext` varchar(20) DEFAULT NULL,
  `path` varchar(300) DEFAULT NULL,
  `size` varchar(200) DEFAULT NULL,
  `type` varchar(120) DEFAULT NULL,
  `isImg` varchar(8) DEFAULT NULL,
  `downcounts` int(6) DEFAULT NULL,
  `uploadTime` datetime DEFAULT NULL,
  `userId` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId` (`userId`),
  CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(8) NOT NULL,
  `username` varchar(80) DEFAULT NULL,
  `password` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, 'xiaochen', '123456');
INSERT INTO `t_user` VALUES (2, 'zhangsan', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

```



## 运行项目

```
1.在poem.xml中导入项目中需要的依赖

2.修改application.properties中spring.datasource.username与spring.datasource.password

3.运行访问、进入登陆页面
http://localhost:8989/files/index 进行登陆界面
```



## 错误处理

### 1.访问出现404但是代码没有错误

**解决：**将jar添加到lib文件夹下

![image-20210215202500330](file://C:/Users/%E9%BB%8E%E5%85%88%E6%A1%A6/Desktop/CodeStudyingResource/JAVA/SSM/mybatis-spring-springmvc-oracle-maven%E9%AB%98%E7%BA%A7-%E6%9D%83%E9%99%90%E7%AE%A1%E7%90%86/%E7%AC%94%E8%AE%B0/SpringMVC/SpringMVC%E5%AD%A6%E4%B9%A0.assets/image-20210215202500330.png?lastModify=1614763048)

