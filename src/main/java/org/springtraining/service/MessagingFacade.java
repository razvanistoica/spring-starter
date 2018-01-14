package org.springtraining.service;

import org.springframework.stereotype.Component;

@Component
public class MessagingFacade {

    private MessagingService service;

    public MessagingFacade(MessagingService service) {
        this.service = service;
    }

    public void send(String message) {
        //System.out.println("Sending message: " + message);
        service.sendMessage(message);
    }
}
