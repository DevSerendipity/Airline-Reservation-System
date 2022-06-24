package com.ARS.ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ticket {

    private static final Random RANDOM = new Random();
    private String passengerName;
    private List<String> companies = Arrays.asList( "Qatar Airways", "Singapore Airlines", "ANA All Nippon Airways",
                                                    "Cathay Pacific Airways", "Emirates", "EVA Air" );
    private List<String> from = Arrays.asList( "Finland", "United States", "Sweden", "Denmark", "Norway", "Hong Kong",
                                               "New Zealand", "Canada", "Australia", "France" );
    private List<String> destination = Arrays.asList( "United Kingdom", "Thailand", "Germany", "Mexico", "Turkey",
                                                      "Italy", "China", "United States", "Spain", "France" );
    private final int maxAirlineCode = 99999;
    private int airlineCode = (int) ( Math.random() * maxAirlineCode );
    private List<String> airlineClass = Arrays.asList( "World Traveler", "CLUB WORLD", "WORLD TRAVELER PLUS" );
    private String boardingTime;
    private final int maxGateNumber = 6;
    private int gate = (int) ( Math.random() * maxGateNumber );
    private static final List<String> AVAILABLE_AIRCRAFT_COLUMNS = Arrays.asList( "A", "B", "C", "D", "E", "F", "G",
                                                                                  "H", "J", "K" );
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
        int hours = 24;
        int maxMonthDays = 28;
        double minutes = 60;
        // int year, int month, int dayOfMonth, int hour, int minute
        LocalDateTime now = LocalDateTime.of( 1, 1, setTimePeriod( (int) ( Math.random() * maxMonthDays ) ),
                                              setTimePeriod( (int) ( Math.random() * hours ) ),
                                              setTimePeriod( (int) ( Math.random() * minutes ) ) );
        boardingTime = now.format( DateTimeFormatter.ofPattern( "dd HH:mm" ) );
        return boardingTime;
    }

    private int setTimePeriod( int timePeriod ) {
        return timePeriod;
    }

    public int getGate() {
        return this.gate;
    }

    public String calculateNewRandomSeat() {
        int numberOfSeats = 347;
        return RANDOM.nextInt( numberOfSeats ) + AVAILABLE_AIRCRAFT_COLUMNS.get(
                RANDOM.nextInt( AVAILABLE_AIRCRAFT_COLUMNS.size() ) );
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setPassengerName( String passengerName ) {
        this.passengerName = passengerName;
    }

    public void setCompanies( List<String> companies ) {
        this.companies = companies;
    }

    public void setFrom( List<String> from ) {
        this.from = from;
    }

    public void setDestination( List<String> destination ) {
        this.destination = destination;
    }

    public void setAirlineCode( int airlineCode ) {
        this.airlineCode = airlineCode;
    }

    public void setAirlineClass( List<String> airlineClass ) {
        this.airlineClass = airlineClass;
    }

    public void setBoardingTime( String boardingTime ) {
        this.boardingTime = boardingTime;
    }

    public void setGate( int gate ) {
        this.gate = gate;
    }

    public void setDate( LocalDate date ) {
        this.date = date;
    }

}
