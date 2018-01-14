package org.springtraining.simplejava;

public class JmsMessagingService implements MessagingService {
    private static final  JmsMessagingService INSTANCE = new JmsMessagingService();
    private JmsMessagingService(){}

    public static JmsMessagingService getInstance(){
        return INSTANCE;
    }

    public void sendMessage(String message) {
        System.out.print(message + " JMS");
    }
}
