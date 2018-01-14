package org.springtraining.simplejava;

import java.io.IOException;
import java.util.Properties;

public class SimpleJavaMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(SimpleJavaMain.class.getResourceAsStream("/messaging.properties"));
        String type = properties.getProperty("messaging.type");
        System.out.println(type);

        MessagingService messagingService = null;
        for(int i = 0; i<3; i++){
            if ("JMS".equals(type)) {
                messagingService = JmsMessagingService.getInstance();
                messagingService.sendMessage("salut");
            } else if ("KAFKA".equals(type)) {
                messagingService = new KafkaMessagingService();
                messagingService.sendMessage("salut");
            }
            System.out.println(messagingService);

        }
        messagingService = MessagingServiceFactory.createService("JMS");
        messagingService.sendMessage("salut");
        System.out.println(messagingService);

    }
}
