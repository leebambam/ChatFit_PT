package com.sideproject.chatfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {

	@GetMapping("/")
	public String goMain(Model model) {
		return "main";
	}


}
