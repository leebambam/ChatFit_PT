package com.sideproject.chatfit.controller;


import com.sideproject.chatfit.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    @Autowired
    private OpenAIService openAIService;

    @GetMapping("/chat")
    public String chat(@RequestParam(value = "message") String message) {
        return openAIService.getChatResponse(message);
    }
}
