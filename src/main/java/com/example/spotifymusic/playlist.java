package com.example.spotifymusic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class playlist {

    @FXML
    private AnchorPane pane;

    @FXML
    private void initialize(){
        System.out.println("i");
        User user = finduser();
        int count=0;
        for (Song song : user.getPlaylist()){
            count++;
            Button button = new Button();
            button.setOnAction(event -> {
                try {
                    movepage(event,song);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            button.setPrefWidth(250);
            button.setPrefHeight(30);
            button.setLayoutX(50);
            button.setLayoutY(100+(30*count));
            button.setText(song.getName());
            pane.getChildren().add(button);
        }

    }

    public User finduser(){
        for (User user : User.users){
            if (user.isHaslogged()){
                return user;
            }
        }
        return null;
    }
    Stage stage;
    Scene scene;
    public void swichtos1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s1t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s2t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtos3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s3t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtos4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s4t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

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

    public void swichtos7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("s7t.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void swichtos8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("st8.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void movepage(ActionEvent event , Song s) throws IOException {
        if (s.getName().equals("All too well")){
            swichtos1(event);
        }
        else if (s.getName().equals("Bad Blood")){
            swichtos2(event);
        }
        else if (s.getName().equals("Blinding Lights")){
            swichtos3(event);
        }
        else if (s.getName().equals("Save your tears")){
            swichtos4(event);
        }
        else if (s.getName().equals("Blackbird")){
            swichtos6(event);
        }
        else if (s.getName().equals("Here Comes the Sun")){
            swichtos5(event);
        }
        else if (s.getName().equals("Yellow")){
            swichtos7(event);
        }
        else if (s.getName().equals("A Sky Full of Stars")){
            swichtos8(event);
        }


    }
}
