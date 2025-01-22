package com.sideproject.chatfit.vo.user;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UserVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_num;				//유저 고유식별 번호
	
	@Column
	private String user_id;
	
	@Column
	private String user_email;
	
	@Column
	private String user_nickname;
	
	@Column
	private String user_pw;
	
	@Column
	private int user_age;
	
	@Column
	private int user_gender;
	
	@Column
	private String user_address1;
	
	@Column
	private String user_address2;
	
	@Column
	private int zipcode;
	
	@Column
	private float user_weight;
	
	@Column
	private float user_height;
	
	@Column
	private int user_level;				//운동 수준
	
	@Column
	private int user_goal;				//운동 목표
	
	@Column
	private String user_health_status;	//기존 질환 정보 등
	
	@Column
	private Date user_rdate;
	
	@Column
	private Date user_mdate;
	
	@Column
	private int user_auth;
	
	@Column
	private String user_photo;

}
