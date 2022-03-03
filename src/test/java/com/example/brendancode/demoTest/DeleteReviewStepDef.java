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
public class DeleteReviewStepDef {
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
        sakilaDbApplication = new SakilaDbApplication(
                languageRepository,actorRepository,filmRepository,categoryRepository,userReviewRepository);}

    int iD;
    UserReview deleteReview;
    @Given("I want to delete an existing review")
    public void i_want_to_delete_an_existing_review() {
        Setup();
        // Write code here that turns the phrase above into concrete actions
        iD=7;
    }

    String actual;
    @When("A new review is deleted")
    public void a_new_review_is_deleted() {
        // Write code here that turns the phrase above into concrete actions
        actual=sakilaDbApplication.deleteReviewByID(iD);
    }
    @Then("the review should be removed from the movie it was left on")
    public void the_review_should_be_removed_from_the_movie_it_was_left_on() {
        String expected = "deleted";
        // Write code here that turns the phrase above into concrete actions
        ArgumentCaptor<Integer>reviewArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
        verify(userReviewRepository).deleteById(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();

        Assertions.assertEquals(expected, actual);
    }
}
