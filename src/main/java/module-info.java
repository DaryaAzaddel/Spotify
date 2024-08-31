module com.example.spotifymusic {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.spotifymusic to javafx.fxml;
    exports com.example.spotifymusic;
}