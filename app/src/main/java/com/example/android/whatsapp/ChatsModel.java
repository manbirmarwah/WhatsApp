package com.example.android.whatsapp;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ChatsModel {

    private String Name;
    private String Message;
    private int Photo;
    private String Time;

    public ChatsModel() {

    }

    //Getter
    public ChatsModel(String name, String message, int photo, String time) {
        Name = name;
        Message = message;
        Photo = photo;
        Time = time;
    }

    //Getter
    public String getName() {
        return Name;
    }

    public String getMessage() {
        return Message;
    }

    public int getPhoto() {
        return Photo;
    }

    public String getTime() {
        return Time;
    }

    //Setter
    public void setName(String name) {
        Name = name;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public void setTime(String time) {
        Time = time;
    }
}
