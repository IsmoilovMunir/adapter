package com.example.adapter.model;

import java.time.LocalDateTime;

public class MessageB {
    private String text;
    private LocalDateTime createdDate;
    private int currentTemp;

    public MessageB() {
    }

    public MessageB(String text, LocalDateTime createdDate, int currentTemp) {
        this.text = text;
        this.createdDate = createdDate;
        this.currentTemp = currentTemp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
}
