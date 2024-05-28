package com.study.futurelab.application.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.study.futurelab.application.websocket.obj.ChatMessage;

/**
 * 너무 간단하게 구현하였기 때문에 Controller 형태
 * 본래는 handler로 구현해야 한다.
 * 추후 변경 필요
 */
@Controller
public class ChatHandler {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }
}
