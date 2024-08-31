package com.example.spotifymusic;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;

public class controls5 {
    @FXML
    private AnchorPane pane;
    @FXML
    private ProgressBar songProgressBar;
    @FXML
    private Button playButton, pauseButton, resetButton;
    private Media media;
    private MediaPlayer mediaPlayer;
    private DoubleProperty progress = new SimpleDoubleProperty();
    @FXML
    private Label lname;

    @FXML
    private Label lalbum;

    @FXML
    private Label llyrics;

    @FXML
    private Label lplays;

    @FXML
    private Label lyear;

    private Media m = new Media(getClass().getResource("/sounds/hc.mp3").toString());

    private MediaPlayer s = new MediaPlayer(m);

    @FXML
    private void initialize(){
        Singer singer = find();
        lname.setText(singer.getSongs().get(0).getName());
        lyear.setText("Released year: "+singer.getSongs().get(0).getYear());
        lalbum.setText("Album: "+singer.getSongs().get(0).getAlbum());
        lplays.setText("Plays: "+Integer.toString(singer.getSongs().get(0).getPlays()) + " billions");
        llyrics.setText("Lyric: "+ singer.getSongs().get(0).getLyrics());
        progress.bind(Bindings.createDoubleBinding(() ->
                        s.getCurrentTime().toMillis() / m.getDuration().toMillis(),
                s.currentTimeProperty()));
        songProgressBar.progressProperty().bind(progress);
        playButton.setOnAction(e -> playMedia());
        pauseButton.setOnAction(e -> pauseMedia());
        resetButton.setOnAction(e -> resetMedia());

    }

    private Singer find(){
        for (Singer singer :Singer.singers){
            if (singer.getName().equals("The Beatles")){
                return singer;
            }
        }
        return null;
    }

    public void add(){
        User u = finduser();
        Song s = find().getSongs().get(0);
        if (!mojood(u,s)){
            u.getPlaylist().add(s);
            System.out.println("a");
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

    public void playMedia() {
        s.play();
    }

    public void pauseMedia() {
        s.pause();
    }

    public void resetMedia() {
        s.stop();
        s.seek(s.getStartTime());
    }
    Stage stage;
    Scene scene;

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("thebeatles.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public boolean mojood(User u , Song s){
        for (Song song : u.getPlaylist()){
            if (song.getName().equals(s.getName())){
                return true;
            }
        }
        return false;
    }
}
