package com.ARS.flight.controller;

import com.ARS.flight.Flight;
import com.ARS.flight.view.FlightView;

public class FlightController {

    private final Flight model;
    private final FlightView view;

    public FlightController(Flight model, FlightView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        this.view.flightDetails(this.model.getMoneySpentOnFlight(), this.model.getFlightPrice(),
                                this.model.getLuggageQuantity());
    }
}
