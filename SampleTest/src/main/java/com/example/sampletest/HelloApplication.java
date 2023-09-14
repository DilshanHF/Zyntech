package com.example.sampletest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Admin Dashboard");
        stage.setScene(scene);
        stage.show();
        //stage.setFullScreen(true);
    }





    public static void main(String[] args) {
        launch();
    }
}