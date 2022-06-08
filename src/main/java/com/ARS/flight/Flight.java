package com.ARS.flight;

import org.decimal4j.util.DoubleRounder;

public class Flight {

    private int moneySpentOnFlight = (int) (Math.random() * 30.0D);
    private double flightPrice = Math.random() * 60 + 22D;
    private int luggageQuantity = (int) (Math.random() * 19D);

    public int getMoneySpentOnFlight() {
        return this.moneySpentOnFlight;
    }

    public double getFlightPrice() {
        return DoubleRounder.round(this.flightPrice, 2);
    }

    public int getLuggageQuantity() {
        return this.luggageQuantity;
    }

    public void setMoneySpentOnFlight(int moneySpentOnFlight) {
        this.moneySpentOnFlight = moneySpentOnFlight;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setLuggageQuantity(int luggageQuantity) {
        this.luggageQuantity = luggageQuantity;
    }

}