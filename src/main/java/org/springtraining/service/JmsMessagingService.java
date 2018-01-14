package org.springtraining.service;

public class JmsMessagingService implements MessagingService {

    public void sendMessage(String message) {
        System.out.println("Jms msg");
    }
}
