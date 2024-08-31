package com.example.spotifymusic;

public class Song {
    private String name;

    private int year;
    private String album;
    private String lyrics;
    private int plays;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAlbum() {
        return album;
    }

    public String getLyrics() {
        return lyrics;
    }

    public int getPlays() {
        return plays;
    }

    public Song(String name, int year, String album, String lyrics, int plays) {
        this.name = name;
        this.year = year;
        this.album = album;
        this.lyrics = lyrics;
        this.plays = plays;
    }
}
