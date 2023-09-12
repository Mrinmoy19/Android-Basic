package com.deasy.myapplication.models;

public class ChatModel {
    public String name;
    public String message;
    public String time;
    public boolean isNew;
    public String imagePath;

    public ChatModel(String name, String message, boolean isNew, String imagePath) {
        this.name = name;
        this.message = message;
        this.time = "12:00 AM";
        this.isNew = isNew;
        this.imagePath = imagePath;
    }
}
