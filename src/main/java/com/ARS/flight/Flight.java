package com.ARS.flight;

import com.ARS.user.User;
import org.decimal4j.util.DoubleRounder;


public class Flight {
    private int fare_tarries = (int)(Math.random() * 30.0D);
    private double price = Math.random() * 60 + 22D;
    private int luggage = (int)(Math.random() * 19D);
    private User hasMoney;

    public int getFare_tarries() {
        return this.fare_tarries;
    }

    public double getPrice() {
        return DoubleRounder.round(this.price, 2);
    }

    public int getLuggage() {
        return this.luggage;
    }

    public User getHasMoney() {
        return this.hasMoney;
    }

    public void setFare_tarries(int fare_tarries) {
        this.fare_tarries = fare_tarries;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public void setHasMoney(User hasMoney) {
        this.hasMoney = hasMoney;
    }
}