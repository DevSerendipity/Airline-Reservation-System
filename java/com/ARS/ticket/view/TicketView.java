package com.ARS.ticket.view;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

import java.util.List;

public class TicketView {

    public void TicketDetails(String passenger_name, List<String> companies, List<String> from, List<String> destination, int IATA_airline_code, List<String> airline_class, String boarding_time, int gate, String seat, LocalDate date) {
        System.out.println("Ticket: ");
        System.out.println("Passenger Name: " + passenger_name);
        System.out.println("Company Name: " + randomElement(companies));
        System.out.println("Going from: " + randomElement(from));
        System.out.println("Destination: " + randomElement(destination));
        System.out.println("AIRLINE CODE: " + IATA_airline_code);
        System.out.println("AIRLINE class: " + randomElement(airline_class));
        System.out.println("Boarding Time, will be in " + boarding_time + " DAY/HOURS/MINUTES");
        System.out.println("Gate: " + gate);
        System.out.println("Seat: " + seat);
        System.out.println("Date: " + date);
        System.out.println("-------------");
    }

    private String randomElement(@NotNull List<String> element){
       return element.get((int)(Math.random() * element.size()));
    }
}
