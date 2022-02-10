package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Film;
import com.example.brendancode.demo.Language;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SakilaDbApplicationTests {
    private Language language = new Language();
    private Film film = new Film();

    @Test
    public void test_getLanguage(){
        language.setName("testname");
        assertEquals("testname", language.getName());
    }

    @Test
    public void test_getFilm(){
        film.setTitle("testfilm");
        assertEquals("testfilm", film.getTitle());
    }

}
