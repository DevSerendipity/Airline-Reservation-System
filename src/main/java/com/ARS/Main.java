package com.ARS;

import com.ARS.flight.Flight;
import com.ARS.flight.controller.FlightController;
import com.ARS.flight.view.FlightView;

import com.ARS.ticket.Ticket;
import com.ARS.ticket.controller.TicketController;
import com.ARS.ticket.view.TicketView;

import com.ARS.user.User;
import com.ARS.user.controller.UserController;
import com.ARS.user.view.UserView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start( Stage stage ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "/done.fxml" ) );
        Scene scene = new Scene( fxmlLoader.load() );
        stage.setTitle( "AIRLINE RESERVATION SYSTEM !" );
        stage.setScene( scene );
        stage.show();
    }

    public static void main( String[] args ) {

        isChecking();

        User userModel = setUser();
        UserView userView = new UserView();
        UserController userController = new UserController( userModel, userView );

        Flight flightModel = setFlight();
        FlightView flightView = new FlightView();
        FlightController flightController = new FlightController( flightModel, flightView );

        Ticket ticketModel = setTicket();
        TicketView ticketView = new TicketView();
        TicketController ticketController = new TicketController( ticketModel, ticketView );

        updateViews( userController, flightController, ticketController );

        launch( args );
    }

    private static void updateViews( UserController userController, FlightController flightController,
                                     TicketController ticketController ) {
        userController.updateView();
        flightController.updateView();
        ticketController.updateView();
    }

    private static User setUser() {
        User user = new User();
        user.setName( "Robert" );
        user.setLastName( "Jr." );
        user.setAccountMoney( user.getAccountMoney() );
        return user;
    }

    private static Flight setFlight() {
        Flight flight = new Flight();
        flight.setMoneySpentOnFlight( flight.getMoneySpentOnFlight() );
        flight.setFlightPrice( flight.getFlightPrice() );
        flight.setLuggageQuantity( flight.getLuggageQuantity() );

        return flight;
    }

    private static Ticket setTicket() {
        Ticket ticket = new Ticket();
        setUserData( ticket );
        setAirlineData( ticket );
        setBoardingData( ticket );
        return ticket;
    }

    private static void setBoardingData( Ticket ticket ) {
        ticket.setAirlineClass( ticket.getAirlineClass() );
        ticket.setBoardingTime( ticket.getBoardingTime() );
        ticket.setGate( ticket.getGate() );
        ticket.setDate( ticket.getDate() );
        ticket.calculateNewRandomSeat();
    }

    private static void setUserData( Ticket ticket ) {
        ticket.setPassengerName( User.getDefaultName() );
    }

    private static void setAirlineData( Ticket ticket ) {
        ticket.setCompanies( ticket.getCompanies() );
        setTravelingPoints( ticket );
        ticket.setAirlineCode( ticket.getAirlineCode() );
    }

    private static void setTravelingPoints( Ticket ticket ) {
        while ( isMatchingDestination( ticket ) ) {
            ticket.setFrom( ticket.getFrom() );
            ticket.setDestination( ticket.getDestination() );
        }
    }

    private static boolean isMatchingDestination( Ticket ticket ) {
        return ticket.getFrom() == ticket.getDestination();
    }

    private static boolean hasMoney() {
        return setUser().getAccountMoney() > setFlight().getFlightPrice();
    }

    private static void isChecking() {
        if ( hasMoney() ) {
            System.out.printf( "Customer %s has money for a ticket", User.getDefaultName() );
        } else {
            System.err.printf( "Customer %s doesn't have money for a ticket", User.getDefaultName() );
            System.exit( 404 );
        }
    }
}
