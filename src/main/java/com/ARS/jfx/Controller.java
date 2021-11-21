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
    @FXML
    private TextField first_name;
    @FXML
    private TextField last_name;
    @FXML
    private DatePicker date;

    private int luggagePrice;
    @FXML
    private TextField money_id;
    @FXML
    private Button checkout;
    @FXML
    private ComboBox<Integer> luggage;
    @FXML
    private ComboBox<String> destination;
    @FXML
    private ComboBox<String> classes;
    @FXML
    private ComboBox<String> from;
    
    @FXML
    void MouseExited() {
        if (!luggage.getItems().contains(1)) {
            luggage.getItems().addAll(1, 2, 3);
        }

    }

    @FXML
    void onMousePressedLuggage() {
        if (luggage.getSelectionModel().getSelectedIndex() == 0) {
            luggagePrice = 0;
            luggagePrice += 19;
        } else if (luggage.getSelectionModel().getSelectedIndex() == 1) {
            luggagePrice = 0;
            luggagePrice += 27;
        } else if (this.luggage.getSelectionModel().getSelectedIndex() == 2) {
            luggagePrice = 0;
            luggagePrice += 35;
        }
    }

    @FXML
    void onClassPressed() {
        for (int i = 0; i < ticket.getAirline_class().size(); ++i) {
            classes.getItems().add(ticket.getAirline_class().get(i));
        }
    }

    @FXML
    void onDestinationPressed() {
        for (int i = 0; i < ticket.getDestination().size(); ++i) {
            destination.getItems().add(ticket.getDestination().get(i));
        }
    }

    @FXML
    void onFromPressed() {
        for (int i = 0; i < ticket.getFrom().size(); ++i) {
            from.getItems().add(ticket.getFrom().get(i));
        }
    }

    @FXML
    void onDisplay() {
        this.money_id.setDisable(true);
        int price;
        int totalPrice;
        switch (destination.getSelectionModel().getSelectedIndex()) {
            case 0 -> {
                price = 40;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 1 -> {
                price = 80;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 2 -> {
                price = 55;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 3 -> {
                price = 35;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 4 -> {
                price = 60;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 5 -> {
                price = 70;
                totalPrice = price + this.getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 6 -> {
                price = 100;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 7 -> {
                price = 25;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 8 -> {
                price = 30;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
            case 9 -> {
                price = 20;
                totalPrice = price + getLuggage(luggagePrice);
                value("$" + totalPrice);
            }
        }
    }

    private int getLuggage(int luggageP) {
        return luggageP;
    }

    private void value(String values) {
        money_id.setText(values);
    }

    @FXML
    void onPressed() throws IOException {
        Stage stage = (Stage) checkout.getScene().getWindow();
        stage.close();
        if (!stage.isFocused()) {
            fillMap();
        }

        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/anotherSmart.fxml"));
        Scene scene = new Scene(fxmlLoader2.load());
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
                prop.setProperty("firstName", this.first_name.getText());
                prop.setProperty("last_name", this.last_name.getText());
                prop.setProperty("luggage_price", String.valueOf(this.luggagePrice));
                prop.setProperty("class", this.classes.getSelectionModel().getSelectedItem());
                prop.setProperty("from", this.from.getSelectionModel().getSelectedItem());
                prop.setProperty("destination", this.destination.getSelectionModel().getSelectedItem());
                prop.setProperty("Date", dates);
                prop.setProperty("Price", this.money_id.getText());
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
