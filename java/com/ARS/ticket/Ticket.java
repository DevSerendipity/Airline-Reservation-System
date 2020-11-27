package com.ARS.ticket;

import java.awt.Image;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ticket {
    private static final Random random = new Random();
    private String passenger_name;
    private List<String> companies = Arrays.asList("Qatar Airways", "Singapore Airlines", "ANA All Nippon Airways", "Cathay Pacific Airways", "Emirates", "EVA Air");
    private List<String> from = Arrays.asList("Finland", "United States", "Sweden", "Denmark", "Norway", "Hong Kong", "New Zealand", "Canada", "Australia", "France");
    private List<String> destination = Arrays.asList("United Kingdom", "Thailand", "Germany", "Mexico", "Turkey", "Italy", "China", "United States", "Spain", "France");
    private int IATA_airline_code = (int)(Math.random() * 99999.0D);
    private List<String> airline_class = Arrays.asList("World Traveler", "CLUB WORLD", "WORLD TRAVELER PLUS");
    private String boarding_time;
    private int gate = (int)(Math.random() * 5.0D + 1.0D);
    private static final List<String> AVAILABLE_AIRCRAFT_COLUMNS = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "J", "K");
    private LocalDate date = LocalDate.now();
    private Image barcode;

    public String getPassenger_name() {
        return this.passenger_name;
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

    public int getIATA_airline_code() {
        return this.IATA_airline_code;
    }

    public List<String> getAirline_class() {
        return this.airline_class;
    }

    public String getBoarding_time() {
        LocalDateTime now = LocalDateTime.of(1, 1, (int)(Math.random() * 4.0D + 1.0D), (int)(Math.random() * 24.0D), (int)(Math.random() * 60.0D));
        boarding_time = now.format(DateTimeFormatter.ofPattern("dd HH:mm"));
        return boarding_time;
    }

    public int getGate() {
        return this.gate;
    }

    public String calculateNewRandomSeat() {
        return random.nextInt(347) + AVAILABLE_AIRCRAFT_COLUMNS.get(random.nextInt(AVAILABLE_AIRCRAFT_COLUMNS.size()));
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Image getBarcode() {
        return this.barcode;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
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

    public void setIATA_airline_code(int IATA_airline_code) {
        this.IATA_airline_code = IATA_airline_code;
    }

    public void setAirline_class(List<String> airline_class){ this.airline_class = airline_class; }

    public void setBoarding_time(String boarding_time) {
        this.boarding_time = boarding_time;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setBarcode(Image barcode) {
        this.barcode = barcode;
    }
}
