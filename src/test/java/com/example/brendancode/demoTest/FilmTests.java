package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTests {
    @Test
    void setNameTest(){
    Film testName = new Film();
    testName.setRating("PG");
    assertEquals( "PG", testName.getRating(), "Incorrect movie rating has been selected");

    }
}
