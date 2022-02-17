package com.example.brendancode.demoTest;

import com.example.brendancode.demo.Category;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CategoryTest {
    private Category category = new Category();

    @Test
    public void testGetCategory(){
        category.setName("Games");
        Assert.assertEquals("Should display Games category", category.getName(),"Games");
    }
}
