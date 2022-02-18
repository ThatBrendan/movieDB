package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LanguageTests {
    private Language language = new Language();

    @Test
    void setNameTest(){
        Language testName = new Language();
        testName.setName("Patois");
        assertEquals( "Patois", testName.getName(),"This should display Patois else there is a problem with function");
    }

    @Test
    public void testGetName(){
        Language getNameTest = new Language("Test Language");
        assertEquals("Test Language", getNameTest.getName(), "The test has failed");
    }

    @Test
    public void test_constructor(){
        Language language = new Language();
        assertTrue(language instanceof Language, "This is an incorrect instance of Language");
    }

    @Test
    public void testLanguageBy_id(){
        assertEquals(0, language.getLanguage_id(), "This test has failed");
    }

}
