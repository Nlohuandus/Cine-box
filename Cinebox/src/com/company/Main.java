package com.company;

public class Main {

    public static void main(String[] args) {
        Movie backToTheFuture = new Movie("Back to the future","Ciencia ficcion",90);
        backToTheFuture.setWonOscar(true);

        Series breakingBad= new Series("Breaking bad","Drama", 50,10,10);
        breakingBad.setEpisodeDuration(50);
        breakingBad.setTotalEpisodes(12);
        breakingBad.setTotalSeasons(5);

        breakingBad.moveForward();
        Media media = new Media("media", "action", 120);
       String title = media.getTitle();
       String genre = media.getGenre();

    }
}
