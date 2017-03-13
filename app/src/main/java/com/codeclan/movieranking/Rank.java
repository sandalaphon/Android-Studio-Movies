package com.codeclan.movieranking;
import com.codeclan.movieranking.Movie;
import java.util.ArrayList;

public class Rank {
   private ArrayList<Movie> topTen;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private Movie movie4;
    private Movie movie5;
    private Movie movie6;
    private Movie movie7;
    private Movie movie8;
    private Movie movie9;
    private Movie movie10;
    public Rank(){
        topTen = new ArrayList<Movie>();
        Movie movie1 = new Movie("The Nightmare on Elm Street", "Horror", 1);
        Movie movie2 = new Movie("The Nightmare on Elm Street2", "Horror", 2);
        Movie movie3 = new Movie("The Nightmare on Elm Street3", "Horror", 3);
        Movie movie4 = new Movie("The Nightmare on Elm Street4", "Horror", 4);
        Movie movie5 = new Movie("The Nightmare on Elm Street5", "Horror", 5);
        Movie movie6 = new Movie("The Nightmare on Elm Street6", "Horror", 6);
        Movie movie7 = new Movie("The Nightmare on Elm Street7", "Horror", 7);
        Movie movie8 = new Movie("The Nightmare on Elm Street8", "Horror", 8);
        Movie movie9 = new Movie("The Nightmare on Elm Street9", "Horror", 9);
        Movie movie10 = new Movie("The Nightmare on Elm Street10", "Horror", 10);
        topTen.add(movie1);
        topTen.add(movie2);
        topTen.add(movie3);
        topTen.add(movie4);
        topTen.add(movie5);
        topTen.add(movie6);
        topTen.add(movie7);
        topTen.add(movie8);
        topTen.add(movie9);
        topTen.add(movie10);
    }

    public Movie getMovieByRank(int index) {
        return topTen.get(index-1);
    }

    public void replaceLastMovie(Movie newMovie) {
        this.topTen.remove(9);
        this.topTen.add(9, newMovie);
    }

    public Movie findByTitle(String title){
        for (Movie movie : topTen){
            if (movie.getTitle()==title){return movie;}
        }
        return null;
    }

    public void moveUpOneRank(String title){
        Movie toPromote = findByTitle(title);
        Movie holder;
        int index = 0;
        for (Movie movie : topTen) {
            if (movie == toPromote) {
            holder=topTen.get(index-1);
            topTen.set(index-1, toPromote);
                topTen.set(index, holder);
                toPromote.setCurrentRank(index);
                holder.setCurrentRank(index+1);
            }
           index++;
        }
    }

    public void moveDownOneRank(String title){
        Movie toDemote = findByTitle(title);
        Movie holder;
        int index = 0;
        for (Movie movie : topTen) {
            if (movie == toDemote) {
                holder=topTen.get(index+1);
                topTen.set(index+1, toDemote);
                topTen.set(index, holder);
                toDemote.setCurrentRank(index+2);
                holder.setCurrentRank(index+1);
                return;
            }
            index++;
            ;
        }
    }

}
