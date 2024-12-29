CREATE TABLE `user` (
	`user_num` INT NOT NULL,
	`user_id`	VARCHAR(60)		NOT NULL,
	`user_email`	VARCHAR(255)	NOT NULL,
	`user_nickname`	VARCHAR(36)		NOT NULL,
	`user_password`	VARCHAR(255)	NOT NULL,
	`user_age`	INT 	NULL,
	`user_gender`	INT		NULL,
	`user_weight`	FLOAT	NULL,
	`user_height`	FLOAT	NULL,
	`user_level` INT NULL	COMMENT '1:beginner, 2:intermediate, 3:advanced',
	`user_goal`	INT	NULL	COMMENT '1:diet, 2:muscle growth, 3:etc.',
	`user_health_status`	INT NULL	COMMENT 'existing health conditions',
	`user_address1`	VARCHAR(255)	NOT NULL,
    `user_address2`	VARCHAR(255)	NOT NULL,
    `user_zipcode`	INT(5)	NOT NULL,
	`user_rdate`	DATETIME	NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	`user_mdate`	DATETIME	NULL,
	`user_auth`	INT	NOT NULL	DEFAULT 1	COMMENT '0: suspended, 1: normal, 2: withdrawn, 9: admin',
	`user_photo`	VARCHAR(255)	NULL
);

ALTER TABLE `user` ADD CONSTRAINT `PK_user` PRIMARY KEY (
	`user_num`
);

CREATE INDEX user_num_idx ON `user` (`user_num`);