package com.company;

public class Media {
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void download() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading " + title);
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(title + " Downloaded!");
                content = "A un tipo le matan su perrito y va y se desquita con todos";
            }
        });
        thread.start();
    }

    public String getTitle() {
        return title;
    }

    private void printSomething(String something) {
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

    public void play() {
        printSomething("Playing " + title);
    }

    public void pause() {
        printSomething(title + " paused");
    }

    @Override
    public String toString() {
        return "Media title is " + title + '\'' + ", genre='" + genre + '\'' + ", duration=" + duration;
    }
}
