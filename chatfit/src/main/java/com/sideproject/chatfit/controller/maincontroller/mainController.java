package com.sideproject.chatfit.controller.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class mainController {

	@GetMapping("/")
	public String init(Model model) {
		model.addAttribute("title","챗핏 메인");
		model.addAttribute("message","어서오세요");
		return "main";
	}
	
//	@GetMapping("/main")
//	public String goMain(Model model) {
//		model.addAttribute("title","챗핏 메인");
//		model.addAttribute("message","어서오세요");
//		return "main";
//	}
	
}
