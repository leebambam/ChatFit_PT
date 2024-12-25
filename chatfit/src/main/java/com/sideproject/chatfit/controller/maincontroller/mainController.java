package com.sideproject.chatfit.controller.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sideproject.chatfit.vo.UserVO;

import ch.qos.logback.core.model.Model;


@Controller
public class mainController {

	@GetMapping("/")
	public String init() {
		return "main/baseMain";
	}
	
	@GetMapping("/main/baseMain")
	public String goMain() {
		return "main/baseMain";
	}

}
