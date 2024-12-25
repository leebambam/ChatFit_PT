package com.sideproject.chatfit.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OpenAIService {

    //@Value("${openai.api.key}")
    private String apiKey;

    //@Value("${openai.api.url}")
    private String apiUrl;

    public String getChatResponse(String userMessage) {
        RestTemplate restTemplate = new RestTemplate();

        // 요청 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        // 요청 바디 설정
        String requestBody = String.format("""
                {
                    "model": "gpt-3.5-turbo",
                    "messages": [
                        {"role": "user", "content": "%s"}
                    ]
                }
                """, userMessage);

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // API 호출 및 응답 반환
        Map<String, Object> response = restTemplate.postForObject(apiUrl, requestEntity, Map.class);
        Map<String, Object> choices = (Map<String, Object>) ((java.util.List) response.get("choices")).get(0);
        Map<String, Object> message = (Map<String, Object>) choices.get("message");

        return message.get("content").toString();
    }
}
