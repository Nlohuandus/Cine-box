package com.company;

public class Movie extends Media {
    boolean wonOscar;

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}
