package com.ARS.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UsersOption extends Application {


    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("/done.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Text Duplicate Project!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {launch(args);}
}
