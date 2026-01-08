package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }

    public Sad(Date currentDate) {
        super(currentDate);
    }

    @Override
    public String moodString() {
        return "sad";
    }
}
