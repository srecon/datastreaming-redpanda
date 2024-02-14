package com.blu.streaming.redpandaproducer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerServices {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(){
        kafkaTemplate.send("demo-topic","test message");
    }
}
