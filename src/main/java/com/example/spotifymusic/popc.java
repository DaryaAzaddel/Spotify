package com.example.spotifymusic;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class popc {
    Stage stage;
    Scene scene;

    public void swichtot(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("taylorswift.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtotw(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("theweekend.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



}
