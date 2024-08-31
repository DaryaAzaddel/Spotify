package com.example.spotifymusic;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.stream.IntStream;

public class UserMenucontroller {

    @FXML
    private TextField tfu;
    @FXML
    private TextField tfe;
    @FXML
    private TextField tfn;
    @FXML
    private TextField tfl;
    @FXML
    private MenuButton mbm;
    @FXML
    private MenuButton mby;
    @FXML
    private MenuButton mbd;
    @FXML
    private MenuButton mbg;



    public int year1;

    @FXML
    private void initialize(){
        User user = finduser();

        IntStream.rangeClosed(1924, 2024)
                .forEach(year -> {
                    MenuItem item = new MenuItem(String.valueOf(year));
                    item.setOnAction(e -> {
                        year1 = year;
                        mby.setText(String.valueOf(year));
                    });
                    mby.getItems().add(item);
                });

        IntStream.rangeClosed(1,12).forEach(month -> {
            MenuItem item = new MenuItem(String.valueOf(month));
            item.setOnAction(event -> mbm.setText(item.getText()));
            mbm.getItems().add(item);
        });

        IntStream.rangeClosed(1,31).forEach(day -> {
            MenuItem item = new MenuItem(String.valueOf(day));
            item.setOnAction(event -> mbd.setText(item.getText()));
            mbd.getItems().add(item);
        });

        MenuItem item1 = new MenuItem("Female");
        item1.setOnAction(event -> mbg.setText(item1.getText()));
        mbg.getItems().add(item1);

        MenuItem item2 = new MenuItem("Male");
        item2.setOnAction(event -> mbg.setText(item2.getText()));
        mbg.getItems().add(item2);

        MenuItem item3 = new MenuItem("Other");
        item3.setOnAction(event -> mbg.setText(item3.getText()));
        mbg.getItems().add(item3);


        tfu.setPromptText(user.getUseranme());
        tfe.setPromptText(user.getEmail());
        tfn.setPromptText(user.getName());
        tfl.setPromptText(user.getLastname());
        mby.setText(Integer.toString(user.getYear()));
        mbm.setText(Integer.toString(user.getMonth()));
        mbd.setText(Integer.toString(user.getDay()));
        mbg.setText(genderint(user.getGender()));


    }

    Stage stage;
    Scene scene;

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public User finduser(){
        for (User user : User.users){
            if (user.isHaslogged()){
                return user;
            }
        }
        return null;
    }

    public String genderint(int n){
        if (n==1){
            return "Female";
        }
        else if (n==2){
            return "Male";
        }
        else if (n==3){
            return "Other";
        }
        return "";
    }
    @FXML
    private Label error;

    private void showerror(String s){
        error.setText(s);
        error.setVisible(true);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(10));
        pauseTransition.setOnFinished(event -> error.setVisible(false));
        pauseTransition.play();

    }

    public void editu(){
        String s = tfu.getText();
        if (!s.isEmpty()){
            finduser().setUseranme(s);
            showerror("Username edited successfully!");
        }
        else {
            showerror("invalid username!");
        }
    }
    public void edite(){
        String s = tfe.getText();
        if (!s.isEmpty()){
            if (s.matches("[a-zA-Z0-9]+@gmail.com")){
                finduser().setEmail(s);
                showerror("Email edited successfully!");
            }
            else {
                showerror("invalid Email!");
            }
        }
        else{
            showerror("invalid Email!");
        }
    }

    public void editn(){
        String s = tfn.getText();
        if (!s.isEmpty()){
            finduser().setName(s);
            showerror("Name edited successfully!");
        }
        else{
            showerror("invalid Name!");
        }
    }
    public void editl(){
        String s = tfl.getText();
        if (!s.isEmpty()){
            finduser().setLastname(s);
            showerror("Lastname edited successfully!");
        }
        else{
            showerror("invalid Lastname!");
        }
    }
    public void editb(){
        int y = Integer.parseInt(mby.getText());
        int m = Integer.parseInt(mbm.getText());
        int d = Integer.parseInt(mbd.getText());

        finduser().setYear(y);
        finduser().setDay(d);
        finduser().setMonth(m);
        showerror("Date of birth edited successfully!");
    }

    public void editg(){
        String s = mbg.getText();
        if (s.equals("Female")){
            finduser().setGender(1);
            showerror("Gender edited successfully!");
        }
        else if (s.equals("Male")){
            finduser().setGender(2);
            showerror("Gender edited successfully!");
        }
        else if (s.equals("Other")){
            finduser().setGender(3);
            showerror("Gender edited successfully!");
        }
    }

    public void swicthtopl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("playlistf.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
