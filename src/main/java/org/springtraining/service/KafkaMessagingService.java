package org.springtraining.service;

public class KafkaMessagingService implements MessagingService {

    public void sendMessage(String message) {
        System.out.println("Kafka msg");
    }
}
