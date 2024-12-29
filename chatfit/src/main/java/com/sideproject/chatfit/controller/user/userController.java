package com.sideproject.chatfit.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class userController {
	
    /* 회원가입 */
	@GetMapping("/user/registerUser")
	public String registerForm() {
		return "user/registerUser";
	}
	
	@PostMapping("/user/registerUser")
	public String goRegister(HttpServletRequest request) {
		return "common/resultView";
	}
	
	/* 로그인페이지 호출 */
	@GetMapping("/user/loginUser")
	public String loginMain() {
		return "user/loginUser";
	}
}
