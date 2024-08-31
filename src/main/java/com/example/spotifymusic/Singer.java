package com.example.spotifymusic;

import java.util.ArrayList;

public class Singer {
    public static ArrayList<Singer> singers = new ArrayList<>();
    private String name;
    private ArrayList<Song> songs = new ArrayList<>();

    public static ArrayList<Singer> getSingers() {
        return singers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getGenre() {
        return genre;
    }

    public String getPast() {
        return past;
    }

    public int getListener() {
        return listener;
    }

    private String genre;
    private String past;
    private int listener;


    public Singer(String name, ArrayList<Song> songs, String genre, String past, int listener) {
        this.name = name;
        this.songs = songs;
        this.genre = genre;
        this.past = past;
        this.listener = listener;
    }
}
