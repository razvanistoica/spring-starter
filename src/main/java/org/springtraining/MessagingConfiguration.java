package org.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springtraining.service.JmsMessagingService;
import org.springtraining.service.KafkaMessagingService;
import org.springtraining.service.MessagingService;

@Configuration
@ComponentScan
public class MessagingConfiguration {

    @Bean
    public MessagingService messagingService(MessagingProperties properties){
        switch (properties.getType()){
            case JMS:
                return new JmsMessagingService();
            case KAFKA:
                return new KafkaMessagingService();
            default:
                throw new UnsupportedOperationException("Messaging type not supporte" + properties.getType());
        }
    }
}
