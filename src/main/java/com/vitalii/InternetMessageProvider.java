package com.vitalii;

import org.springframework.stereotype.Component;


public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message from InternetMessageProvider";
    }
}
