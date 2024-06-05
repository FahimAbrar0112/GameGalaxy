package com.example.gamegalaxy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        DBInitialization dbinit = new DBInitialization();
        //dbinit.createGameTable();
        //dbinit.createTable();
        //dbinit.insertValues();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
//        String css = this.getClass().getResource("dashBoard.css").toExternalForm();
//        scene.getStylesheets().add(css);
        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}