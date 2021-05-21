package com.company;

import java.util.Scanner;

public class Series extends Media {
    private int totalEpisodes;
    private int totalSeasons;
    private int episodeDuration;

    public Series(String title, String genre, int duration, int totalEpisodes, int totalSeasons) {
        super(title, genre, duration);
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;

    }

    public void moveForward() {
        System.out.println("How many minutes do you want to move forward?");
        Scanner sca = new Scanner(System.in);
        int minutes = sca.nextInt();
        super.moveForward(minutes);
        sca.close();
    }

    public Series() {
        super("", "", 40);
        totalEpisodes = 0;
        totalSeasons = 0;
        episodeDuration = 0;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    @Override
    public int getDuration() {
        return episodeDuration * totalEpisodes;
    }
}
