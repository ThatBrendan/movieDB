package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Film;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTests {

    private Film film = new Film("Title", "Release year", "rating");

    @Test
    void setNameTest(){
    Film testName = new Film("Title", "Release year", "rating");
    testName.setRating("PG");
    assertEquals( "PG", testName.getRating(), "Incorrect movie rating has been selected");

    }

    @Test
    public void test_getFilm(){
        film.setTitle("testfilm");
        Assert.assertEquals("testfilm", film.getTitle());
    }
}
