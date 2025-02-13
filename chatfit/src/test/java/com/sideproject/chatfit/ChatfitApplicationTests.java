package com.sideproject.chatfit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sideproject.chatfit.service.UserService;
import com.sideproject.chatfit.vo.User;

@SpringBootTest
@Transactional
class ChatfitApplicationTests {

	@Autowired
	private UserService userservice;
	
	@Test
	void contextLoads() {
			User user = new User();
			user.setUser_id("ytldnjs");
			user.setUser_pw("14125");
			user.setUser_age(15);
			
			User savedUser = userservice.createUser(user);
			
			assertThat(savedUser).isNotNull();
	        assertThat(savedUser.getUser_num()).isNotNull(); // user_num이 자동 생성되었는지 확인
	        assertThat(savedUser.getUser_id()).isEqualTo("ytldnjs");
	}

}
