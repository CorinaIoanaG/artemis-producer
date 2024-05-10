package com.artemisproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.List;

@Configuration
public class MessageSender {

    private List<String> weatherList;
    private int lastIndex;

    public MessageSender() {
        weatherList = List.of("It's sunny", "It's raining", "It's snowing");
        lastIndex = 0;
    }
    @Autowired
    Producer producer;
    @Scheduled(fixedDelay = 1000)
    public void produce() {
        String message;
        if(++lastIndex == weatherList.size()) {
            lastIndex = 0;
        }
        message = weatherList.get(lastIndex);
        producer.send(message);
    }
}