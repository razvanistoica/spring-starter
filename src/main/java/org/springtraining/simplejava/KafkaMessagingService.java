package org.springtraining.simplejava;

public class KafkaMessagingService implements MessagingService {
    public void sendMessage(String message) {
        System.out.print(message + " KAFKA");

    }
}
