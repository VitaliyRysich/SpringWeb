package com.vitalii;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message from InternetMessageProvider";
    }
}
