package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoryTest {

    private Category category = new Category();

    @Test
    public void testGetCategory(){
        category.setName("Games");
        assertEquals("Games", category.getName(),"Should display Games category");
    }

    @Test
    public void testCategoryBy_id(){
        assertEquals(1, category.getCategory_id(), "This test has failed");
    }

    @Test
    public void test_constructor(){
        Category category = new Category();
        assertTrue(category instanceof Category, "Not the right instance of Category");
    }
}
