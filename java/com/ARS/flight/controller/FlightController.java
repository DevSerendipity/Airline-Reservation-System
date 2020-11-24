package com.ARS.flight.controller;

import com.ARS.flight.Flight;
import com.ARS.flight.view.FlightView;
import com.ARS.user.User;

public class FlightController {
    Flight model;
    FlightView view;

    public FlightController(Flight model, FlightView view) {
        this.model = model;
        this.view = view;
    }

    public void setFare_tarries(int fare_tarries) {
        this.model.setFare_tarries(fare_tarries);
    }

    public void setPrice(double price) {
        this.model.setPrice(price);
    }

    public void setLuggage(int luggage) {
        this.model.setLuggage(luggage);
    }

    public void setHasMoney(User hasMoney) {
        this.model.setHasMoney(hasMoney);
    }

    public int getFare_tarries() {
        return this.model.getFare_tarries();
    }

    public double getPrice() {
        return this.model.getPrice();
    }

    public int getLuggage() {
        return this.model.getLuggage();
    }

    public User getHasMoney() {
        return this.model.getHasMoney();
    }

    public void updateView() {
        this.view.FlightDetails(this.model.getFare_tarries(), this.model.getPrice(), this.model.getLuggage());
    }
}
