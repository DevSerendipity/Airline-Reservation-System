package com.ARS.flight.view;

public class FlightView {

    public void FlightDetails(int fare_tarries, double price, int luggage) {
        System.out.println("Flight Details: ");
        System.out.println("Fare Tarries: " + fare_tarries + "$");
        System.out.println("Flight Price: " + price + "$");
        System.out.println("Luggage Number: " + luggage);
        System.out.println("-------------");
    }
}