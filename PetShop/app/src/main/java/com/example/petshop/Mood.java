package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date currentDate;

    public Mood() {
        this.currentDate = new Date();
    }

    public Mood(Date currentDate) {
        setCurrentDate(currentDate);
    }

    public Date getCurrentDate() {
        if (currentDate == null) {
            return null;
        }
        return new Date(currentDate.getTime());
    }

    public void setCurrentDate(Date currentDate) {
        if (currentDate == null) {
            this.currentDate = new Date();
        } else {
            this.currentDate = new Date(currentDate.getTime());
        }
    }

    public abstract String moodString();
}
