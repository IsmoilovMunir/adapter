package com.example.serviceB.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MessageB {
    private String text;
    private LocalDateTime createDate;
    private int currentTemp;

    public MessageB() {
    }

    public MessageB(String text, LocalDateTime createDate, int currentTemp) {
        this.text = text;
        this.createDate = createDate;
        this.currentTemp = currentTemp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
}
