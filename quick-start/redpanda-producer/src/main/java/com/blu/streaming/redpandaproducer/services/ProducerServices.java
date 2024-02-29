package com.blu.streaming.redpandaproducer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerServices {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage() throws InterruptedException{
        int cnt = 0;
        while (true){
            kafkaTemplate.send("demo-topic", "partition:"+cnt,"test message");
            Thread.sleep(2000);
            System.out.println("Message sent: " + cnt);
            cnt ++;
        }
        //kafkaTemplate.send("demo-topic","test message");
    }
}
