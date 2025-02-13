package com.sideproject.chatfit.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sideproject.chatfit.service.UserService;
import com.sideproject.chatfit.vo.User;


@Controller
@RequestMapping("/user")
public class userController {
	
	private final UserService userService;
	
	public userController(UserService userService) {
        this.userService = userService;
    }
	
    /* 회원가입 */
	@GetMapping("/registerUser")
	public String registerForm() {
		return "user/registerUser";
	}
	
	@PostMapping("/registerUser")
	public String goRegister(@ModelAttribute("registerUser") User userVo, Model model) {
		
		//데이터 저장 로직
		userService.createUser(userVo);
		
		model.addAttribute("message", "저장 성공!");
		return "common/resultView";
	}
	
	/* 로그인페이지 호출 */
	@GetMapping("/loginUser")
	public String loginMain() {
		return "user/loginUser";
	}
}
