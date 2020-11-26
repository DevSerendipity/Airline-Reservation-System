package com.ARS.jfx;

import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class UsersOption extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setController(new UsersOption());
        Parent root = FXMLLoader.load(this.getClass().getResource("/done.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX 13");
        stage.setScene(scene);
        stage.show();
    }
}
