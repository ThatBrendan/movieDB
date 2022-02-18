package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Actor;
import com.example.brendancode.demo.Film;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActorTests {
    private Actor actor = new Actor();
    private Set<Film> testFilmSet = new HashSet<>();


    @Test
    public void testGetFirstName(){
        actor.setFirst_name("Alec");
        Assert.assertEquals("Should display Alec", actor.getFirst_name(), "Alec");
    }

    @Test
    public void testGetLastName(){
        actor.setLast_name("Wayne");
        Assert.assertEquals("Should display Wayne", actor.getLast_name(), "Wayne");
    }

    @Test
    public void getActor_id(){
        actor.setActor_id(1);
        assertEquals(1, actor.getActor_id(), "this actor id is wrong");
    }

    @Test
    public void test_constructor(){
        Actor actor = new Actor();
        assertTrue(actor instanceof Actor, "Not an actor instance");
    }

    @Test
    public void test_getActorSet(){
        testFilmSet.add(new Film("test title", 2012,"PG",1 ));
        actor.setFilm(testFilmSet);
        assertEquals(testFilmSet, actor.getFilm(), "Get or Set film isnt working");
    }

}
