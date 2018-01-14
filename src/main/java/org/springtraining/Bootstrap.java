package org.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springtraining.service.MessagingFacade;

public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MessagingConfiguration.class);
        MessagingFacade facade = context.getBean(MessagingFacade.class);
        facade.send("Message sent");
    }
}
