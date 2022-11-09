package com.example.consumers_service.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MessageController {

    @SendTo("/topic/group/diabetes-result")
    public Message broadcastGroupMessage(@Payload Message message) {
        //Sending this message to all the subscribers
        return message;
    }

    @SendTo("/topic/group/diabetes-statistics")
    public Message broadcastGroupMessage2(@Payload Message message) {
        //Sending this message to all the subscribers
        return message;
    }

    @SendTo("/topic/group/diabetes")
    public Message broadcastGroupMessage3(@Payload Message message) {
        //Sending this message to all the subscribers
        return message;
    }
}
