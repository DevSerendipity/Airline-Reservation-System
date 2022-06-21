package com.ARS.ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ticket {

    private static final Random random = new Random();
    private String passengerName;
    private List<String> companies = Arrays.asList("Qatar Airways", "Singapore Airlines", "ANA All Nippon Airways",
                                                   "Cathay Pacific Airways", "Emirates", "EVA Air");
    private List<String> from = Arrays.asList("Finland", "United States", "Sweden", "Denmark", "Norway", "Hong Kong",
                                              "New Zealand", "Canada", "Australia", "France");
    private List<String> destination = Arrays.asList("United Kingdom", "Thailand", "Germany", "Mexico", "Turkey",
                                                     "Italy", "China", "United States", "Spain", "France");
    private int airlineCode = (int) (Math.random() * 99999.0D);
    private List<String> airlineClass = Arrays.asList("World Traveler", "CLUB WORLD", "WORLD TRAVELER PLUS");
    private String boardingTime;
    private int gate = (int) (Math.random() * 5.0D + 1.0D);
    private static final List<String> AVAILABLE_AIRCRAFT_COLUMNS = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H",
                                                                                 "J", "K");
    private LocalDate date = LocalDate.now();

    public String getPassengerName() {
        return this.passengerName;
    }

    public List<String> getCompanies() {
        return this.companies;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public List<String> getDestination() {
        return this.destination;
    }

    public int getAirlineCode() {
        return this.airlineCode;
    }

    public List<String> getAirlineClass() {
        return this.airlineClass;
    }

    public String getBoardingTime() {
        LocalDateTime now = LocalDateTime.of(1, 1, (int) (Math.random() * 4.0D + 1.0D), (int) (Math.random() * 24.0D),
                                             (int) (Math.random() * 60.0D));
        boardingTime = now.format(DateTimeFormatter.ofPattern("dd HH:mm"));
        return boardingTime;
    }

    public int getGate() {
        return this.gate;
    }

    public String calculateNewRandomSeat() {
        int numberOfSeats = 347;
        return random.nextInt(numberOfSeats) + AVAILABLE_AIRCRAFT_COLUMNS.get(
                random.nextInt(AVAILABLE_AIRCRAFT_COLUMNS.size()));
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    public void setAirlineCode(int airlineCode) {
        this.airlineCode = airlineCode;
    }

    public void setAirlineClass(List<String> airlineClass) {
        this.airlineClass = airlineClass;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
