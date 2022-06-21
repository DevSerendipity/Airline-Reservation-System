package com.ARS.jfx;

import com.ARS.ticket.Ticket;

import java.io.FileOutputStream;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class Controller {

    private final Ticket ticket = new Ticket();
    private int luggagePrice;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private DatePicker date;
    @FXML
    private TextField currentPrice;
    @FXML
    private Button checkout;
    @FXML
    private ComboBox<Integer> luggageQuantity;
    @FXML
    private ComboBox<String> destination;
    @FXML
    private ComboBox<String> classes;
    @FXML
    private ComboBox<String> from;

    @FXML void onMouseExited() {
        int firstItem = 1;
        if ( !luggageQuantity.getItems().contains(firstItem) ) {
            luggageQuantity.getItems().addAll(1, 2, 3);
        }
    }

    @FXML void onMousePressedLuggage() {
        int smallLuggagePrice = 19;
        int mediumLuggagePrice = 27;
        int largeLuggagePrice = 35;
        if ( luggageQuantity.getSelectionModel().getSelectedIndex() == 0 ) {
            luggagePrice = 0;
            luggagePrice += smallLuggagePrice;
        } else if ( luggageQuantity.getSelectionModel().getSelectedIndex() == 1 ) {
            luggagePrice = 0;
            luggagePrice += mediumLuggagePrice;
        } else if ( this.luggageQuantity.getSelectionModel().getSelectedIndex() == 2 ) {
            luggagePrice = 0;
            luggagePrice += largeLuggagePrice;
        }
    }

    @FXML void onClassPressed() {
        for ( int i = 0; i < ticket.getAirlineClass().size(); ++i ) {
            classes.getItems().add(ticket.getAirlineClass().get(i));
        }
    }

    @FXML void onDestinationPressed() {
        for ( int i = 0; i < ticket.getDestination().size(); ++i ) {
            destination.getItems().add(ticket.getDestination().get(i));
        }
    }

    @FXML void onFromPressed() {
        for ( int i = 0; i < ticket.getFrom().size(); ++i ) {
            from.getItems().add(ticket.getFrom().get(i));
        }
    }

    @FXML void onDisplay() {
        this.currentPrice.setDisable(true);
        int price;
        switch (destination.getSelectionModel().getSelectedIndex()) {
            case 0 -> {
                price = 40;
                getPrice(price);
            }
            case 1 -> {
                price = 80;
                getPrice(price);
            }
            case 2 -> {
                price = 55;
                getPrice(price);
            }
            case 3 -> {
                price = 35;
                getPrice(price);
            }
            case 4 -> {
                price = 60;
                getPrice(price);
            }
            case 5 -> {
                price = 70;
                getPrice(price);
            }
            case 6 -> {
                price = 100;
                getPrice(price);
            }
            case 7 -> {
                price = 25;
                getPrice(price);
            }
            case 8 -> {
                price = 30;
                getPrice(price);
            }
            case 9 -> {
                price = 20;
                getPrice(price);
            }
            default -> {
                price = 10;
                getPrice(price);
            }
        }
    }

    private void getPrice(int price) {
        int totalPrice;
        totalPrice = price + getLuggagePrice(luggagePrice);
        value("$" + totalPrice);
    }

    private int getLuggagePrice(int luggagePrice) {
        return luggagePrice;
    }

    private void value(String values) {
        currentPrice.setText(values);
    }

    @FXML final void onPressed() {
        Stage stage = (Stage) checkout.getScene().getWindow();
        stage.close();
        if ( !stage.isFocused() ) {
            fillMap();
        }

        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/anotherSmart.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader2.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("AIRLINE RESERVATION SYSTEM !");
        stage.setScene(scene);
        stage.show();

    }

    private void fillMap() {
        try {
            FileOutputStream output = new FileOutputStream("src/main/resources/reports.properties");
            try {
                Properties prop = new Properties();
                String dates = this.date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                prop.setProperty("firstName", this.firstName.getText());
                prop.setProperty("last_name", this.lastName.getText());
                prop.setProperty("luggage_price", String.valueOf(this.luggagePrice));
                prop.setProperty("class", this.classes.getSelectionModel().getSelectedItem());
                prop.setProperty("from", this.from.getSelectionModel().getSelectedItem());
                prop.setProperty("destination", this.destination.getSelectionModel().getSelectedItem());
                prop.setProperty("Date", dates);
                prop.setProperty("Price", this.currentPrice.getText());
                prop.store(output, null);
                System.out.println(prop);
            } catch (Throwable e) {
                try {
                    output.close();
                } catch (Throwable el) {
                    e.addSuppressed(el);
                }
                throw e;
            }
            output.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
