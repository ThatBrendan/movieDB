package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Category;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoryTest {
    private Category category = new Category();

    @Test
    public void testGetCategory(){
        category.setName("Games");
        Assert.assertEquals("Should display Games category", category.getName(),"Games");
    }

    @Test
    public void testCategoryBy_id(){
        assertEquals(0, category.getCategory_id(), "This test has failed");
    }

    @Test
    public void test_constructor(){
        Category category = new Category();
        assertTrue(category instanceof Category, "Not the right instance of Category");
    }
}
