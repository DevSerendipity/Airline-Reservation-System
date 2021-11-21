package com.ARS.ticket.controller;

import com.ARS.ticket.Ticket;
import com.ARS.ticket.view.TicketView;

import java.awt.Image;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;

public class TicketController {
    Ticket model;
    TicketView view;

    public TicketController(Ticket model, TicketView view) {
        this.model = model;
        this.view = view;
    }

   /* public void setFrom(String[] from) {
        this.model.setFrom(Arrays.asList(from));
    }*/

    public void updateView() {
        this.view.TicketDetails(this.model.getPassenger_name(), this.model.getCompanies(), this.model.getFrom(), this.model.getDestination(), this.model.getIATA_airline_code(), this.model.getAirline_class(), this.model.getBoarding_time(), this.model.getGate(), this.model.calculateNewRandomSeat(), this.model.getDate());
    }
}
