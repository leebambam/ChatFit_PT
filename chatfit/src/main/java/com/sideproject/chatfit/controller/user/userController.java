package com.sideproject.chatfit.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sideproject.chatfit.vo.user.UserVO;


@Controller
public class userController {
	
    /* 회원가입 */
	@GetMapping("/user/registerUser")
	public String registerForm() {
		return "user/registerUser";
	}
	
	@PostMapping("/user/registerUser")
	public String goRegister(@ModelAttribute("registerUser") UserVO userVo, Model model) {
		
		//데이터 저장 로직
		
		model.addAttribute("message", "저장 성공!");
		return "common/resultView";
	}
	
	/* 로그인페이지 호출 */
	@GetMapping("/user/loginUser")
	public String loginMain() {
		return "user/loginUser";
	}
}
