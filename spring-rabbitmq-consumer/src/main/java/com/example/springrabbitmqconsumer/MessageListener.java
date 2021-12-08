package com.example.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageListener {

    @RabbitListener(queues = MQonfig.QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }
}
