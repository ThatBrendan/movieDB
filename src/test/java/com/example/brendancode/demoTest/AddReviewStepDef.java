package com.example.brendancode.demoTest;


import com.example.brendancode.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AddReviewStepDef {
    private SakilaDbApplication sakilaDbApplication;

    @Mock
    private LanguageRepository languageRepository; //Creating a fake DB version of repos
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private ActorRepository actorRepository;
    @Mock
    private UserReviewRepository userReviewRepository;

    @BeforeEach
    void Setup(){
        languageRepository = mock(LanguageRepository.class);
    actorRepository=mock(ActorRepository.class);
    filmRepository=mock(FilmRepository.class);
    categoryRepository=mock(CategoryRepository.class);
    userReviewRepository=mock(UserReviewRepository.class);
    sakilaDbApplication = new SakilaDbApplication(languageRepository,actorRepository,filmRepository,categoryRepository,userReviewRepository);}

    UserReview saveReview;
    @Given("I want to add a new review")
    public void i_want_to_add_a_new_review() {
        Setup();
        // Write code here that turns the phrase above into concrete actions
        saveReview = new UserReview(2, "The movie was really boring");
    }

    String actual;
    @When("A new review is added")
    public void a_new_review_is_added() {
        // Write code here that turns the phrase above into concrete actions
        actual = sakilaDbApplication.addReview(
                saveReview.getFilm_film_id(),
                saveReview.getUser_review()
        );
    }
    @Then("the review should be added to the movie and saved")
    public void the_review_should_be_added_to_the_movie_and_saved() {
        // Write code here that turns the phrase above into concrete actions
        String expected = "save"; // Review updated response

        ArgumentCaptor<UserReview>reviewArgumentCaptor = ArgumentCaptor.forClass(UserReview.class);
        verify(userReviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual, "New review data has not been added to mock database");
    }
}
