CREATE TABLE IF NOT EXISTS `my_db`.`stats_device_online` (
  `device_id` CHAR(32) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  `record_date` DATE NOT NULL,
  `online_seconds` BIGINT(11) NULL,
  `online_status` SMALLINT(2) NULL,
  `online_days` INT(11) NULL,
  `offline_days` INT(11) NULL,
  `last_login_time` DATETIME NULL,
  `last_logout_time` DATETIME NULL,
  `last_update_time` DATETIME NULL,
  `create_time` DATETIME NULL,
  PRIMARY KEY (`device_id`, `record_date`)) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '在线时长统计表';

