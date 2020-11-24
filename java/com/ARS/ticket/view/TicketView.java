package com.ARS.ticket.view;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;

public class TicketView {
    public TicketView() {
    }

    public void TicketDetails(String passenger_name, List<String> companies, List<String> from, List<String> destination, int IATA_airline_code, List<String> airline_class, String boarding_time, int gate, String seat, LocalDate date) {
        System.out.println("Ticket: ");
        System.out.println("Passenger Name: " + passenger_name);
        PrintStream var10000 = System.out;
        Object var10001 = companies.get((int)(Math.random() * (double)companies.size()));
        var10000.println("Company Name: " + (String)var10001);
        var10000 = System.out;
        var10001 = from.get((int)(Math.random() * (double)from.size()));
        var10000.println("Going from: " + (String)var10001);
        var10000 = System.out;
        var10001 = destination.get((int)(Math.random() * (double)destination.size()));
        var10000.println("Destination: " + (String)var10001);
        System.out.println("AIRLINE CODE: " + IATA_airline_code);
        var10000 = System.out;
        var10001 = airline_class.get((int)(Math.random() * (double)airline_class.size()));
        var10000.println("AIRLINE class: " + (String)var10001);
        System.out.println("Boarding Time, will be in " + boarding_time + " DAY/HOURS/MINUTES");
        System.out.println("Gate: " + gate);
        System.out.println("Seat: " + seat);
        System.out.println("Date: " + date);
        System.out.println("-------------");
    }
}
