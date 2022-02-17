package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Actor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTests {
    private Actor actor = new Actor();


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

}
