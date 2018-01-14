package org.springtraining.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springtraining.MessagingConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MessagingConfiguration.class)
public class MessagingFacadeIT {

    @Autowired
    private MessagingFacade facade; //= new MessagingFacade();

    @Test
    public void testSendMessage() {
        String message = "test";
        facade.send(message);
    }
}
