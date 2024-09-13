package com.example.serviceB.model;

public class MessageA {
    private String message;
    private String lng;
    private Coordinates coordinates;

    public MessageA() {
    }

    public MessageA(String message, String lng, Coordinates coordinates) {
        this.message = message;
        this.lng = lng;
        this.coordinates = coordinates;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
