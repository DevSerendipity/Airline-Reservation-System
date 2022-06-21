package com.ARS.ticket.controller;

import com.ARS.ticket.Ticket;
import com.ARS.ticket.view.TicketView;

public class TicketController {
    private final Ticket model;
    private final TicketView view;

    public TicketController( Ticket model, TicketView view ) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        this.view.ticketDetails( this.model.getPassengerName(), this.model.getCompanies(), this.model.getFrom(),
                                 this.model.getDestination(), this.model.getAirlineCode(), this.model.getAirlineClass(),
                                 this.model.getBoardingTime(), this.model.getGate(),
                                 this.model.calculateNewRandomSeat(), this.model.getDate() );
    }
}
