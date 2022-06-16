package com.ARS.ticket.controller;

import com.ARS.ticket.Ticket;
import com.ARS.ticket.view.TicketView;

public class TicketController {
    Ticket model;
    TicketView view;

    public TicketController(Ticket model, TicketView view) {
        this.model = model;
        this.view  = view;
    }

    public void updateView() {
        this.view.ticketDetails(this.model.getPassenger_name(), this.model.getCompanies(), this.model.getFrom(), this.model.getDestination(), this.model.getIATA_airline_code(), this.model.getAirline_class(), this.model.getBoarding_time(), this.model.getGate(), this.model.calculateNewRandomSeat(), this.model.getDate());
    }
}
