package com.patroclos.mcpclient.controllers;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/mcp")
public class MctMessageController {

    private final ChatClient chatClient;

    public MctMessageController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

//    @GetMapping("/message")
//    public SseEmitter streamMessages(@RequestParam String sessionId) {
//        // Create an SseEmitter with a timeout (in ms)
//        SseEmitter emitter = new SseEmitter(1_000L);
//        return emitter;
//    }
}
