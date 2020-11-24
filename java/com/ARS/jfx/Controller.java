package com.ARS.jfx;

import com.ARS.ticket.Ticket;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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

    public Controller() {
    }

    @FXML
    void MouseExited() {
        if (!this.luggage.getItems().contains(1)) {
            this.luggage.getItems().addAll(1, 2,3 );
        }

    }

    @FXML
    void onMousePressedLuggage() {
        if (this.luggage.getSelectionModel().getSelectedIndex() == 0) {
            this.luggagePrice = 0;
            this.luggagePrice += 19;
        } else if (this.luggage.getSelectionModel().getSelectedIndex() == 1) {
            this.luggagePrice = 0;
            this.luggagePrice += 27;
        } else if (this.luggage.getSelectionModel().getSelectedIndex() == 2) {
            this.luggagePrice = 0;
            this.luggagePrice += 35;
        }

    }

    @FXML
    void onClassPressed() {
        for(int i = 0; i < ticket.getAirline_class().size() && !this.classes.getItems().contains(this.ticket.getAirline_class().get(i)); ++i) {
            this.classes.getItems().add(this.ticket.getAirline_class().get(i));
        }

    }

    @FXML
    void onDestinationPressed() {
        for(int i = 0; i < this.ticket.getDestination().size() && !this.destination.getItems().contains(this.ticket.getDestination().get(i)); ++i) {
            this.destination.getItems().add(this.ticket.getDestination().get(i));
        }

    }

    @FXML
    void onFromPressed() {
        for(int i = 0; i < this.ticket.getFrom().size() && !this.from.getItems().contains(this.ticket.getFrom().get(i)); ++i) {
            this.from.getItems().add(this.ticket.getFrom().get(i));
        }

    }

    @FXML
    void onDisplay() {
        this.money_id.setDisable(true);
        int price;
        int var10001;
        switch(this.destination.getSelectionModel().getSelectedIndex()) {
            case 0:
                price = 40;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 1:
                price = 80;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 2:
                price = 55;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 3:
                price = 35;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 4:
                price = 60;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 5:
                price = 70;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 6:
                price = 100;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 7:
                price = 25;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 8:
                price = 30;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
                break;
            case 9:
                price = 20;
                var10001 = price + this.getLuggage(this.luggagePrice);
                this.value("$" + var10001);
        }
    }

    private int getLuggage(int luggageP) {
        return luggageP;
    }

    private void value(String values) {
        this.money_id.setText(values);
    }

    @FXML
    void onPressed() throws IOException {
        Stage stage = (Stage)this.checkout.getScene().getWindow();
        stage.close();
        if (!stage.isFocused()) {
            this.fillMap();
        }

        FXMLLoader loader2 = new FXMLLoader();
        loader2.setController(new UsersOption());
        Parent root = FXMLLoader.load(this.getClass().getResource("/anotherSmart.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX 13");
        stage.setScene(scene);
        stage.show();
    }

    private void fillMap() {
        try {
            FileOutputStream output = new FileOutputStream("C:/Users/Emir/OneDrive/Documents/NewOne/Airline-Reservation-System/src/main/resources/reports.properties");

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
            } catch (Throwable var5) {
                try {
                    output.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }
                throw var5;
            }
            output.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }
}
