package com.example.brendancode.demoTest;

import com.example.brendancode.demo.UserReview;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserReviewTest {
    private UserReview userReview = new UserReview();

    @Test
    public void test_UserReviewConstructor(){
        UserReview userReview = new UserReview();
        assertTrue(userReview instanceof UserReview, "Not the right instance of constructor");
    }

    @Test
    void setUserReviewTest() {
        UserReview testReview = new UserReview();
        testReview.setUser_review("TestReview");
        assertEquals("TestReview", testReview.getUser_review(), "This should display TestReview");
    }

    @Test
    void setFilmIDtest() {
        UserReview testFilmID = new UserReview();
        testFilmID.setFilm_film_id(1);
        assertEquals(1, testFilmID.getFilm_film_id(), "This should display 1");
    }

    @Test
    void setUserReviewID(){
        UserReview testReviewID = new UserReview();
        testReviewID.setUser_review_id(2);
        assertEquals(2, testReviewID.getUser_review_id(), "This should display 2");
    }
}
