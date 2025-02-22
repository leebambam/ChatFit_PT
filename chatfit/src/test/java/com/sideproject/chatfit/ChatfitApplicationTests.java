package com.sideproject.chatfit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sideproject.chatfit.service.UserService;
import com.sideproject.chatfit.vo.User;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
@Transactional
class ChatfitApplicationTests {

	@Autowired
	private UserService userservice;
	
	//데이터 들어가는테스트
	@Test
	void contextLoads() {
			User user = new User();
			user.setUserId("ytldnjs");
			user.setUserPw("14125");
			user.setUserAge(15);
			
			User savedUser = userservice.createUser(user);
			
			assertThat(savedUser).isNotNull();
	        assertThat(savedUser.getUserNum()).isNotNull(); // userNum이 자동 생성되었는지 확인
	        assertThat(savedUser.getUserId()).isEqualTo("ytldnjs");
	        
	        log.debug("user : " + savedUser);
	}
}
