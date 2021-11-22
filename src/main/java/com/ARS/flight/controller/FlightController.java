package com.ARS.flight.controller;

import com.ARS.flight.Flight;
import com.ARS.flight.view.FlightView;

public class FlightController {

    Flight model;
    FlightView view;

    public FlightController(Flight model, FlightView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        this.view.FlightDetails(this.model.getFare_tarries(), this.model.getPrice(), this.model.getLuggage());
    }
}
