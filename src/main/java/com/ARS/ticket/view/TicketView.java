package com.ARS.ticket.view;

import java.time.LocalDate;

import java.util.List;

public class TicketView {

    public void ticketDetails(String passengerName, List<String> companies, List<String> from,
                              List<String> destination, int airlineCode, List<String> airlineClass,
                              String boardingTime, int gate, String seat, LocalDate date) {
        System.out.println("Ticket: ");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Company Name: " + randomElement(companies));
        System.out.println("Going from: " + randomElement(from));
        System.out.println("Destination: " + randomElement(destination));
        System.out.println("AIRLINE CODE: " + airlineCode);
        System.out.println("AIRLINE class: " + randomElement(airlineClass));
        System.out.println("Boarding Time, will be in " + boardingTime + " DAY/HOURS/MINUTES");
        System.out.println("Gate: " + gate);
        System.out.println("Seat: " + seat);
        System.out.println("Date: " + date);
        System.out.println("-------------");
    }

    private String randomElement(List<String> element) {
        return element.get((int) (Math.random() * element.size()));
    }
}
