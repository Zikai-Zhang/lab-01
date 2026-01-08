package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public Happy() {
        super();
    }

    public Happy(Date currentDate) {
        super(currentDate);
    }

    @Override
    public String moodString() {
        return "happy";
    }
}
