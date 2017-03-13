package com.codeclan.movieranking;

 import com.codeclan.movieranking.Movie;
 import com.codeclan.movieranking.Rank;
 import org.junit.Test;
 import org.junit.Before;

 import java.util.ArrayList;

 import static org.junit.Assert.*;


public class RankTest {
    String title;
    String genre;
    int rank;
    Movie matrix;
    Rank rankings;


    @Before
    public void before() {
        title = "The Matrix";
        genre = "Action";
        rank = 1;
        matrix = new Movie(title, genre, rank);

        rankings = new Rank();
    }

    @Test
    public void testgetMovieByRank(){
        assertEquals("The Nightmare on Elm Street3", rankings.getMovieByRank(3).getTitle());
    }
    @Test
    public void testreplaceLastMovie(){
        rankings.replaceLastMovie(matrix);
        assertEquals("The Matrix", rankings.getMovieByRank(10).getTitle());
    }
    @Test
    public void testfindByTitle(){
        assertEquals(6, rankings.findByTitle("The Nightmare on Elm Street6").getCurrentRank());
    }
    @Test
    public void testmoveUpOneRank(){
        rankings.moveUpOneRank("The Nightmare on Elm Street6");
        assertEquals("The Nightmare on Elm Street6", rankings.getMovieByRank(5).getTitle());
        assertEquals(5, rankings.getMovieByRank(5).getCurrentRank() );
    }



    @Test
    public void testmoveDownOneRank(){
        rankings.moveDownOneRank("The Nightmare on Elm Street6");
        assertEquals("The Nightmare on Elm Street6", rankings.getMovieByRank(7).getTitle());
    }
    @Test
    public void testDemotedMovieCurrentRank(){
        rankings.moveDownOneRank("The Nightmare on Elm Street6");
        assertEquals(7, rankings.getMovieByRank(7).getCurrentRank());

    }
}