package com.vitalii;

public class SimpleMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "message from SimpleMessageProvider";
    }
}