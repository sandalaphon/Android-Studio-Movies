package com.codeclan.movieranking;

/**
 * Created by user on 13/03/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRank;

    public Movie(String title, String genre, int currentRank){
        this.title = title;
        this.genre = genre;
        this.currentRank = currentRank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        genre = genre;
    }

    public int getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(int currentRank) {
        this.currentRank = currentRank;
    }

    @Override
    public String toString(){
        return "Title: " + getTitle() + " Genre: " + getGenre() + " Ranking: " + getCurrentRank();
    }
}
