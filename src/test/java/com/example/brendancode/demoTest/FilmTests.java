package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Actor;
import com.example.brendancode.demo.Film;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FilmTests {
    public Film filmTest = new Film();
    private Set<Actor> testActorSet = new HashSet<>();

    private Film film = new Film("Title", "Release year", "rating");

    @Test
    void setNameTest(){
    Film testName = new Film("Title", "Release year", "rating");
    testName.setRating("PG");
    assertEquals( "PG", testName.getRating(), "Incorrect movie rating has been selected");

    }

    @Test
    public void testFilmTitle(){
        film.setTitle("Snakes on the plane");
        assertEquals("Snakes on the plane", film.getTitle(), "This is not the right film title");
    }

    @Test
    public void testReleaseYear(){
        film.setRelease_year(2002);
        assertEquals(2002, film.getRelease_year(), "This is not the correct film year");
    }

    @Test
    public void testRating(){
        film.setRating("PG-13");
        assertEquals("PG-13", film.getRating(), "This is not the correct film rating");
    }

    @Test
    public void testFilmLanguage_id(){
        film.setLanguage_id(1);
        assertEquals(1, film.getLanguage_id(), "This is not the correct film language id");
    }

    @Test
    public void test_constructor(){
        Film film = new Film();
        assertTrue(film instanceof Film, "This is not a Film instance");
    }

    @Test
    public void test_getActor(){
        testActorSet.add(new Actor("Harry Potter","Johnny"));
        filmTest.setActor(testActorSet);
        assertEquals(testActorSet, filmTest.getActor(), "Get or Set Actor method isn't working");
    }

}
