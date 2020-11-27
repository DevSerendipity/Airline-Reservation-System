package com.ARS;

import com.ARS.flight.Flight;
import com.ARS.flight.controller.FlightController;
import com.ARS.flight.view.FlightView;

import com.ARS.ticket.Ticket;
import com.ARS.ticket.controller.TicketController;
import com.ARS.ticket.view.TicketView;

import com.ARS.user.User;
import com.ARS.user.controller.UserController;
import com.ARS.user.view.UserView;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        User userModel = retrieveUser();
        UserView userView = new UserView();
        UserController userController = new UserController(userModel, userView);

        Flight flightModel = retrieveFlight();
        FlightView flightView = new FlightView();
        FlightController flightController = new FlightController(flightModel, flightView);

        Ticket ticketModel = retrieveTicket();
        TicketView ticketView = new TicketView();
        TicketController ticketController = new TicketController(ticketModel, ticketView);

        isChecking(userController.getAccount_money(), flightController.getPrice());

        userController.updateView();
        flightController.updateView();
        ticketController.updateView();
    }


    private static User retrieveUser() {
        User user = new User();
        user.setName("Robert");
        user.setLast_name("Jr.");
        user.setAccount_money(user.getAccount_money());

        return user;
    }


    private static Flight retrieveFlight() {
        Flight flight = new Flight();
        flight.setFare_tarries(flight.getFare_tarries());
        flight.setPrice(flight.getPrice());
        flight.setLuggage(flight.getLuggage());

        return flight;
    }


    private static Ticket retrieveTicket() {
        Ticket ticket = new Ticket();
        ticket.setPassenger_name(User.getName());
        ticket.setCompanies(ticket.getCompanies());
        ticket.setFrom(ticket.getFrom());
        ticket.setDestination(ticket.getDestination());

        while (ticket.getFrom() == ticket.getDestination()) {
            ticket.setFrom(ticket.getFrom());
            ticket.setDestination(ticket.getDestination());
        }
        ticket.setIATA_airline_code(ticket.getIATA_airline_code());
        ticket.setAirline_class(ticket.getAirline_class());
        ticket.setBoarding_time(ticket.getBoarding_time());
        ticket.setGate(ticket.getGate());
        ticket.setDate(ticket.getDate());
        ticket.calculateNewRandomSeat();
        return ticket;
    }

    private static boolean hasMoney(double money, double price) {
        return money > price;
    }

    private static void isChecking(double val1, double val2) {
        if (hasMoney(val1, val2)) {
            System.out.printf("Customer %s has a ticket", User.getName());
        } else {
            System.err.printf("Customer %s don't have a ticket", User.getName());
            SystemColor.MAGENTA.brighter();
            System.exit(404);
        }

    }
}