--liquibase formatted sql

--changeset hms:系统用户表——20230518
-- freedom.freedom_user_t definition
CREATE TABLE `freedom_user_t` (
  `user_id` bigint(20)  NOT NULL COMMENT '用户ID',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `avatar_name` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `avatar_path` varchar(255) DEFAULT NULL COMMENT '头像真实路径',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `pwd_reset_time` datetime DEFAULT NULL COMMENT '修改密码的时间',
  `is_admin` char(1) DEFAULT 'Y' COMMENT '是否为admin账号,Y是、N否',
  `enable_flag` char(1) DEFAULT 'Y' COMMENT '状态：Y启用、N禁用',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新者',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `renter_id` bigint(20) NOT NULL  COMMENT '租户ID',
  PRIMARY KEY (`user_id`) USING BTREE,
  KEY `freedom_user_t_n2` (`avatar_name`) USING BTREE,
  KEY `inx_enabled` (`enable_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户';