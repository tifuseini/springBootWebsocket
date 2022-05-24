package com.example.webSocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("Hello")
    @SendTo
    public Greeting greet(HelloMessage helloMessage){
        return new Greeting("Hello " + (HtmlUtils.htmlEscape(helloMessage.getName())));

    }
}
