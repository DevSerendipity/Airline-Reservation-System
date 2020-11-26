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

    public void setPassenger_name(String passenger_name) {
        this.model.setPassenger_name(passenger_name);
    }

    public void setCompanies(List<String> companies) {
        this.model.setCompanies(companies);
    }

    public void setFrom(String[] from) {
        this.model.setFrom(Arrays.asList(from));
    }

    public void setDestination(List<String> destination) {
        this.model.setDestination(destination);
    }

    public void setIATA_airline_code(int IATA_airline_code) {
        this.model.setIATA_airline_code(IATA_airline_code);
    }

    public void setBoarding_time(String boarding_time) {
        this.model.setBoarding_time(boarding_time);
    }

    public void setGate(int gate) {
        this.model.setGate(gate);
    }

    public void setDate(LocalDate date) {
        this.model.setDate(date);
    }

    public void setBarcode(Image barcode) {
        this.model.setBarcode(barcode);
    }

    public List<String> getCompanies() {
        return this.model.getCompanies();
    }

    public List<String> getFrom() {
        return this.model.getFrom();
    }

    public List<String> getDestination() {
        return this.model.getDestination();
    }

    public int getIATA_airline_code() {
        return this.model.getIATA_airline_code();
    }

    public List<String> getAirline_class() {
        return this.model.getAirline_class();
    }

    public String getBoarding_time() {
        return this.model.getBoarding_time();
    }

    public int getGate() {
        return this.model.getGate();
    }

    public String calculateNewRandomSeat() {
        return this.model.calculateNewRandomSeat();
    }

    public LocalDate getDate() {
        return this.model.getDate();
    }

    public Image getBarcode() {
        return this.model.getBarcode();
    }

    public void updateView() {
        this.view.TicketDetails(this.model.getPassenger_name(), this.model.getCompanies(), this.model.getFrom(), this.model.getDestination(), this.model.getIATA_airline_code(), this.model.getAirline_class(), this.model.getBoarding_time(), this.model.getGate(), this.model.calculateNewRandomSeat(), this.model.getDate());
    }
}
