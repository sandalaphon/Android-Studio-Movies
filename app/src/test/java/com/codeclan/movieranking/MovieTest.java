package com.codeclan.movieranking;
import com.codeclan.movieranking.Movie;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MovieTest {
    String title;
    String genre;
    int rank;
    Movie matrix;
    @Before
    public void before(){
       title = "The Matrix";
        genre = "Action";
        rank = 1;
        matrix = new Movie(title, genre, rank);
    }
    @Test
    public void testgetTitle(){
        assertEquals("The Matrix", matrix.getTitle());
    }

    @Test
    public void testSetCurrentRank(){
        matrix.setCurrentRank(2);
        assertEquals(2, matrix.getCurrentRank(), 0.01);
    }

    @Test
    public void testToStringOverride(){
        assertEquals("Title: The Matrix Genre: Action Ranking: 1", matrix.toString());
    }
}