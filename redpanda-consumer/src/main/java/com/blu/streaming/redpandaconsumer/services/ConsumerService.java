package com.blu.streaming.redpandaconsumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "demo-topic", groupId = "baristas")
    public void printEvent(String event){
        System.out.println("Consumer, got event: " + event);
    }
}
