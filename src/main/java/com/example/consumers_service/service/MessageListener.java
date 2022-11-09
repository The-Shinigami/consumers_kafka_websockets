package com.example.consumers_service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(topics = "diabetes-result",groupId = "group_id")
    public void listentoresult(Message message) {
        System.out.println("diabetes-result sending via kafka listener..");
        template.convertAndSend("/topic/group/diabetes-result", message);
    }
    @KafkaListener(topics = "diabetes-statistics",groupId = "group_id")
    public void listentostatistics(Message message) {
        System.out.println("diabetes-statistics sending via kafka listener..");
        template.convertAndSend("/topic/group/diabetes-statistics", message);
    }
    @KafkaListener(topics = "diabetes",groupId = "group_id")
    public void listentodiabetes(Message message) {
        System.out.println("diabetes sending via kafka listener..");
        template.convertAndSend("/topic/group/diabetes", message);
    }
}
