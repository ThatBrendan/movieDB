package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Language;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class LanguageTests {
    private Language language = new Language();

    @Test
    void setNameTest(){
        Language testName = new Language();
        testName.setName("Patois");
        assertEquals( "Patois", testName.getName(),"This should display Patois else there is a problem with function");
    }

    @Test
    public void test_getLanguage(){
        language.setName("testname");
        Assert.assertEquals("testname", language.getName());
    }
}
