package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Actor;
import com.example.brendancode.demo.Film;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FilmTests {
   private Set<UserReviewTest> testUserReviewTest = new HashSet<>();
    private Set<Actor> testActorSet = new HashSet<>();

    private Film film = new Film("Title", 1, "rating", "Description");

    @Test
    void setNameTest(){
    Film testName = new Film("Title", 1, "rating", "Description");
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
        assertTrue(film instanceof Film, "This is not a Film instance");
    }

    @Test
    public void test_getActor(){
        testActorSet.add(new Actor("Harry Potter","Johnny"));
        film.setActor(testActorSet);
        assertEquals(testActorSet, film.getActor(), "Get or Set Actor method isn't working");
    }

    @Test
    public void test_getFilm_id(){
        assertEquals(0, film.getFilm_id(), "Set film id isnt working");
    }

    @Test
    public void test_SetFilm_id(){
        film.setFilm_id(1);
        assertEquals(1, film.getFilm_id(), "Set film id isnt working");
    }

    @Test
    public void test_SetDescription() {
        film.setDescription("A movie about spiders");
        assertEquals("A movie about spiders",film.getDescription(), "Set description isnt working");
    }


}
