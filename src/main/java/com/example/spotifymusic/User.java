package com.example.spotifymusic;

import java.util.ArrayList;

public class User {
    public static ArrayList<User> users = new ArrayList<>();

    private ArrayList<Song> playlist = new ArrayList<>();
    private String useranme;
    private String Password;

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    private boolean haslogged;

    public String getPassword() {
        return Password;
    }

    public String getUseranme() {
        return useranme;
    }

    private String name;
    private String lastname;

    public void setHaslogged(boolean haslogged) {
        this.haslogged = haslogged;
    }

    private String email;

    public boolean isHaslogged() {
        return haslogged;
    }

    private int gender;
    private int month;
    private int day;
    private int year;

    public User(String useranme, String password, String name, String lastname, String email, int gender, int month, int day, int year) {
        this.useranme = useranme;
        Password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.haslogged=false;
    }
}
