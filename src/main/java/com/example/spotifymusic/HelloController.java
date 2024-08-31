package com.example.spotifymusic;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usernamefield;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Label error;



    Stage stage;
    Scene scene;

    public void swichtoSignin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Signin.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void swichtomain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void Login(ActionEvent event) throws IOException {
        String username= usernamefield.getText();
        String password = passwordfield.getText();
        if (!username.isEmpty()){
            if (!password.isEmpty()){
                if (usernameexist(username)!=null){
                    if (usernameexist(username).getPassword().equals(password)){
                        showerror("Loggedin successfully!");
                        usernameexist(username).setHaslogged(true);
                        swichtomain(event);
                    }
                    else {
                        showerror("your password is incorrect!");
                    }
                }
                else{
                    showerror("This username doesnt exist!");
                }
            }
            else {
                showerror("Enter your password!");
            }
        }
        else {
            showerror("Enter your username!");
        }
    }

    private void showerror(String s){
        error.setText(s);
        error.setVisible(true);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(10));
        pauseTransition.setOnFinished(event -> error.setVisible(false));
        pauseTransition.play();

    }

    private User usernameexist(String s){
        for (User user : User.users){
            if (user.getUseranme().equals(s)){
                return user;
            }
        }
        return null;
    }
}