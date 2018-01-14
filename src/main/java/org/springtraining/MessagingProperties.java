package org.springtraining;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("messaging.properties")
public class MessagingProperties {
    @Value("${messaging.type}")
    private MessagingType type;

    public MessagingType getType() {
        return type;
    }
}
