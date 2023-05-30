package com.example.chat_application.controller;

import com.example.chat_application.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class OutputMessageController {


    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message send(Message message) throws Exception {
        //String time = new SimpleDateFormat("HH:mm").format(new Date());
        return message;
    }

}
