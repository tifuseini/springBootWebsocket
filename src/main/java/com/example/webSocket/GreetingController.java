package com.example.webSocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    public Greeting greet(HelloMessage helloMessage){
        return new Greeting("Hello "(HtmlUtils.htmlEscape(helloMessage.getName())));

    }
}
