package com.company;

public class Media {
    private String title;
    private String genre;
    private int duration;

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public void moveForward(int minutes){
        System.out.println("Moving Forward " + minutes +" minutes" );
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void play(){
        System.out.println("Playing " + title);
    }
    public void pause(){
        System.out.println(title + " paused");
    }
    @Override
    public String toString() {
        return "Media title is " + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration ;
    }
}
