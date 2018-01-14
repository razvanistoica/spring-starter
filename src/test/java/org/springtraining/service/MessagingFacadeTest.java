package org.springtraining.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessagingFacadeTest {

    private MessagingFacade facade;

    @Mock
    private MessagingService service;

    @Before
    public void before() {
        facade = new MessagingFacade(service);
    }

    @Test
    public void testSend() {
        String message = "unit test";
        facade.send(message);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSendException() {
        doThrow(new IllegalArgumentException("error")).
            when(service).sendMessage(any(String.class));
        String message = "unit test exception";
        facade.send(message);

        fail("Shouldn't get here.");
    }
}
