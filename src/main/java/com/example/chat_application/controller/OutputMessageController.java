package com.example.chat_application.controller;

import com.example.chat_application.service.Greeting;
import com.example.chat_application.service.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Greeting greeting(Message message) throws Exception {
        //Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getText()) + "!");
    }

}
