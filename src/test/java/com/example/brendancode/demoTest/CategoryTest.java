package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoryTest {

    private Category category = new Category();

    @Test
    public void testGetCategory(){
        Category testName = new Category();
        testName.setName("Games");
        assertEquals("Games", testName.getName(),"Should display Games category");
    }

    @Test
    public void testCategoryBy_id(){
        assertEquals(0, category.getCategory_id(), "This test has failed");
    }

    @Test
    public void test_constructor(){
        assertTrue(category instanceof Category, "Not the right instance of Category");
    }
}
