package com.example.spotifymusic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Thebeatles {
    @FXML
    private Label lname;

    @FXML
    private Label lgenre;

    @FXML
    private Label lpast;

    @FXML
    private Label llistener;

    @FXML
    private void initialize(){
        Singer singer = find();
        lname.setText(singer.getName());
        lgenre.setText("Genre: "+singer.getGenre());
        lpast.setText("Past: "+singer.getPast());
        llistener.setText("Listener: "+Integer.toString(singer.getListener()) + " millions");

    }

    private Singer find(){
        for (Singer singer :Singer.singers){
            if (singer.getName().equals("The Beatles")){
                return singer;
            }
        }
        return null;
    }

    Scene scene;
    Stage stage;

    public void swichtos5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s5t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s6t.fxml"));
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
