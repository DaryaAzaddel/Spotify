package com.example.spotifymusic;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

public class Signincontroller {

    @FXML
    private TextField usernameF;

    @FXML
    private PasswordField passwordF;

    @FXML
    private TextField nameF;

    @FXML
    private TextField lastnameF;

    @FXML
    private TextField emailF;

    @FXML
    private MenuButton menuyear;

    @FXML
    private MenuButton menumonth;

    @FXML
    private MenuButton menuday;

    @FXML
    private MenuButton menugender;

    public int year1;
    public int month1;
    public int day1;

    @FXML
    private Label error;

    @FXML
    private void initialize(){
        IntStream.rangeClosed(1924, 2024)
        .forEach(year -> {
            MenuItem item = new MenuItem(String.valueOf(year));
            item.setOnAction(e -> {
                year1 = year;
                menuyear.setText(String.valueOf(year));
            });
            menuyear.getItems().add(item);
        });

        IntStream.rangeClosed(1,12).forEach(month -> {
            MenuItem item = new MenuItem(String.valueOf(month));
            item.setOnAction(event -> menumonth.setText(item.getText()));
            menumonth.getItems().add(item);
        });

        IntStream.rangeClosed(1,31).forEach(day -> {
            MenuItem item = new MenuItem(String.valueOf(day));
            item.setOnAction(event -> menuday.setText(item.getText()));
            menuday.getItems().add(item);
        });

        MenuItem item1 = new MenuItem("Female");
        item1.setOnAction(event -> menugender.setText(item1.getText()));
        menugender.getItems().add(item1);

        MenuItem item2 = new MenuItem("Male");
        item2.setOnAction(event -> menugender.setText(item2.getText()));
        menugender.getItems().add(item2);

        MenuItem item3 = new MenuItem("Other");
        item3.setOnAction(event -> menugender.setText(item3.getText()));
        menugender.getItems().add(item3);
    }


    @FXML
    private void signin(){
        String username= usernameF.getText();
        String password = passwordF.getText();
        String name = nameF.getText();
        String lastname = lastnameF.getText();
        String email = emailF.getText();
        String y = menuyear.getText();
        String m = menumonth.getText();
        String d = menuday.getText();
        String g = menugender.getText();

        if (!username.isEmpty()){
            if (!usernameexist(username)){
                if (!password.isEmpty()){
                    if (correctformatpassword(password)){
                        if (!name.isEmpty()){
                            if (!lastname.isEmpty()){
                                if (!email.isEmpty()){
                                    if (email.matches("[a-zA-Z0-9]+@gmail.com")){
                                        if (!y.equals("Year of birth")){
                                            if (!m.equals("Month of birth")){
                                                if (!d.equals("Day of birth")){
                                                    if (!g.equals("Gender")){
                                                        User user = new User(username,password,name,lastname,email,intgender(g),Integer.parseInt(d),Integer.parseInt(m),Integer.parseInt(y));
                                                        User.users.add(user);
                                                        showerror("Signedin successfully!");

                                                    }
                                                    else {
                                                        showerror("Select your gender!");
                                                    }

                                                }
                                                else {
                                                    showerror("Select day of your birth!");
                                                }

                                            }
                                            else {
                                                showerror("Select month of your birth!");
                                            }
                                        }
                                        else {
                                            showerror("Select year of your birth!");
                                        }
                                    }
                                    else {
                                        showerror("Your email is invalid!");
                                    }

                                }
                                else {
                                    showerror("Enter your email!");
                                }

                            }
                            else {
                                showerror("Enter your lastname!");
                            }
                        }
                        else {
                            showerror("Enter your name!");
                        }

                    }
                    else {
                        showerror("Your password is invalid");
                    }
                }
                else{
                    showerror("Enter your password!");
                }
            }
            else{
                showerror("This username already exists!");
            }
        }
        else{
            showerror("Enter your username!");
        }



    }

    public boolean correctformatpassword(String password){

        if (password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")){
            return true;
        }
        else{
            return false;
        }
    }

    private void showerror(String s){
        error.setText(s);
        error.setVisible(true);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(10));
        pauseTransition.setOnFinished(event -> error.setVisible(false));
        pauseTransition.play();

    }

    private int intgender(String s){
        if (s.equals("Female")){
            return 1;
        }
        else if (s.equals("Male")){
            return 2;
        }
        else if (s.equals("Other")){
            return 3;
        }
        return 0;
    }

    private boolean usernameexist(String s){
        for (User user : User.users){
            if (user.getUseranme().equals(s)){
                return true;
            }
        }
        return false;
    }

    Stage stage;
    Scene scene;

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





}
