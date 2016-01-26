package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	@RequestMapping("/chat")
	public String getChat(Model model){
		return "chat";
	}

	@RequestMapping("/conversation")
	public String getConversation(Model model){
		return "conversation";
	}
}
