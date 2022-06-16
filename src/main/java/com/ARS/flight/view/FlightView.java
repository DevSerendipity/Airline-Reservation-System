package com.ARS.flight.view;

public class FlightView {

    public void FlightDetails(int moneySpentOnFlight, double flightPrice, int luggageQuantity) {
        System.out.println("Flight Details: ");
        System.out.println("Fare Tarries: " + moneySpentOnFlight + "$");
        System.out.println("Flight Price: " + flightPrice + "$");
        System.out.println("Luggage Number: " + luggageQuantity);
        System.out.println("-------------");
    }
}
