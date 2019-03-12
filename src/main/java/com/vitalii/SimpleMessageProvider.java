package com.vitalii;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "message from SimpleMessageProvider";
    }
}
