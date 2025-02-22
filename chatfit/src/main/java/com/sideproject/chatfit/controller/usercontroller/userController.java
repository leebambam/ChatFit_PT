package com.sideproject.chatfit.controller.usercontroller;

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
	public String goRegister(@ModelAttribute("registerUser") User user, Model model) {
		
		boolean pwcheck = user.pwValidation(user.getUserPw());
		
		if(pwcheck) {
			userService.createUser(user);
			//결과 페이지에 넣을 문구
			model.addAttribute("message", "저장 성공!");
			return "common/resultView";
		}
		//결과 페이지에 넣을 문구
		model.addAttribute("message", "저장 실패! 입력값을 다시 확인해주세요");
		return "common/resultView";
	}
	
	/* 로그인페이지 호출 */
	@GetMapping("/loginUser")
	public String loginMain() {
		return "user/loginUser";
	}
	@PostMapping("/loginUser")
	public String goLogin(@ModelAttribute("loginUser") User user, Model model) {
		
		User userClone = userService.getUserByUserId(user.getUserId());

		if(!user.getUserPw().equals(userClone.getUserPw())) {
			model.addAttribute("message", "로그인 실패!");
			model.addAttribute("loginYn", "N");
			return "common/reseultView";
		}
		
		model.addAttribute("loginYn", "Y");
		model.addAttribute("userNickname", userClone.getUserNickname());
		return "main";
	}
	
	
}
