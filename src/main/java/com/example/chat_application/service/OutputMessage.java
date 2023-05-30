package com.example.chat_application.service;

public class OutputMessage {
    private String sender;
    private String text;
    private String time;


    public OutputMessage() {
    }

    public OutputMessage(String sender, String text, String time) {
        this.sender = sender;
        this.text = text;
        this.time = time;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }
    public String getTime() {
        return time;
    }
}
