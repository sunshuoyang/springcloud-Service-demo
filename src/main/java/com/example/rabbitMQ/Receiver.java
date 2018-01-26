package com.example.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Receiver {
    @RabbitHandler
    @RabbitListener(queues = "ssy")
    public void process(String msg) {
        System.out.println("ssy:"+msg);
    }
}
