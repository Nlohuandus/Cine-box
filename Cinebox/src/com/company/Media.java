package com.company;

abstract class Media implements Comparable<Media>{
    private String title;
    private String genre;
    private int duration;
    private String synopsis;
    private String content = "";

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    @Override
    public int compareTo(Media o) {
        return this.getTitle().compareTo(o.getTitle());
    }
    public boolean equals(Object object){
        if(object instanceof Media){
            return this.title.equals(((Media) object).getTitle()) && this.genre.equals(((Media) object).getGenre());
        }else{
            return false;
        }
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printSomething(String something) {
        System.out.println(something);

    }

    public void moveForward(int minutes) {
        printSomething("Moving Forward " + minutes + " minutes");
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

    public abstract void play();

    public void pause() {
        printSomething(title + " paused");
    }

    @Override
    public String toString() {
        return "Media title is " + title + '\'' + ", genre='" + genre + '\'' + ", duration=" + duration;
    }
}
