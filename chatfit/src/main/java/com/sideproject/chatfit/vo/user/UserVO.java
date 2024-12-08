package com.sideproject.chatfit.vo.user;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	private String user_id;
	private String user_email;
	private String user_nickname;
	private int user_age;
	private String user_gender;
	private float user_weight;
	private float user_height;
	private int user_level;
	private int user_goal;
	private String user_health_status;
	private String user_address1;
	private int user_address2;
	private Date user_rdate;
	private Date user_mdate;
	private int user_auth;
	private String user_photo;
}
