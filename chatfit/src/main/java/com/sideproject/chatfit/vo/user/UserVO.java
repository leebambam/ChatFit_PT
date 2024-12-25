package com.sideproject.chatfit.vo.user;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	private int user_num;				//유저 고유식별 번호
	private String user_id;
	private String user_email;
	private String user_nickname;
	private String user_pw;
	private int user_age;
	private int user_gender;
	private String user_address1;
	private String user_address2;
	private int zipcode;
	private float user_weight;
	private float user_height;
	private int user_level;				//운동 수준
	private int user_goal;				//운동 목표
	private String user_health_status;	//기존 질환 정보 등
	private Date user_rdate;
	private Date user_mdate;
	private int user_auth;
	private String user_photo;
}
