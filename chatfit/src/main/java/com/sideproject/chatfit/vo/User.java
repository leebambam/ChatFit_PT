package com.sideproject.chatfit.vo;

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
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userNum;				//유저 고유식별 번호
	
	@Column(unique = true, nullable = false)
	private String userId;
	
	@Column
	private String userEmail;
	
	@Column
	private String userNickname;
	
	@Column
	private String userPw;
	
	@Column
	private int userAge;
	
	@Column
	private int userGender;
	
	@Column
	private String userAddress1;
	
	@Column
	private String userAddress2;
	
	@Column
	private int userZipcode;
	
	@Column
	private float userWeight;
	
	@Column
	private float userHeight;
	
	@Column
	private int userLevel;				//운동 수준
	
	@Column
	private int userGoal;				//운동 목표
	
	@Column
	private String userHealthStatus;	//기존 질환 정보 등
	
	@Column
	private Date userRdate;
	
	@Column
	private Date userMdate;
	
	@Column
	private int userAuth;
	
	/*
	 * 컬럼명 스네이크케이스에서 캐멀케이스로 변경 ( user_id -> userId )
	 * 사유 : jpa를 사용할때 메소드명에 언더스코어(_)가 사용될 경우 언더스코어 이전만 인식
	 * 예) findbyUser_id 는 user_id 컬럼을 찾아서 매핑하는게 아닌 user을 찾음
	*/
	
	//비밀번호 확인 일치여부
	public boolean pwValidation(String user_pwchk) {
		if(userPw.equals(user_pwchk)) {
			return true;
		}
		return false;
	}
}
