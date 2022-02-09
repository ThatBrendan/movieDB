package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageTests {
    @Test
    void setNameTest(){
        Language testName = new Language();
        testName.setName("Patois");
        assertEquals( "Patois", testName.getName(),"This should display Patois else there is a problem with function");
    }
}
