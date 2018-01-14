package org.springtraining.simplejava;

public class MessagingServiceFactory {
    public static MessagingService createService(String type) {
        if ("JMS".equals(type)) {
            return JmsMessagingService.getInstance();
        } else if ("KAFKA".equals(type)) {
            return new KafkaMessagingService();
        }
        return null;
    }
}

