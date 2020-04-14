package com.dbelliazzi.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.dbelliazzi.chat.model.ChatMessage;
import com.dbelliazzi.chat.model.Messagerepo;
import com.dbelliazzi.chat.service.MessageRepositoryService;

/**
 * Author Damiano Belliazzi on 10/04/2020
 */
@Controller
@Transactional

public class ChatController {
	@Autowired
	MessageRepositoryService mr;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
    	try {
			mr.save(new Messagerepo(chatMessage.getContent(),chatMessage.getSender()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // aggiungi user name nella chat web socket
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

}
