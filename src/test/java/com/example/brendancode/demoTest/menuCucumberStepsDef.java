package com.example.brendancode.demoTest;

import com.example.brendancode.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
public final class menuCucumberStepsDef {
    private SakilaDbApplication sakila;
    @Mock
    private LanguageRepository languageRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @BeforeEach
    void setup(){
        languageRepository = mock(LanguageRepository.class);
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        sakila = new SakilaDbApplication(languageRepository, actorRepository, filmRepository, categoryRepository);

    }

    Language savedLanguage;
    @Given("We have a new language to add")
    public void we_have_a_new_language_to_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("We add the new language")
    public void we_add_the_new_language() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The new language should be added to the list")
    public void the_new_language_should_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    Actor savedActor;
    @Given("We have a new actor to add")
    public void we_have_a_new_actor_to_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("We add the new actor")
    public void we_add_the_new_actor() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The new actor should be added to the list")
    public void the_new_actor_should_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    Film savedFilm;
    @Given("We have a new film to add")
    public void we_have_a_new_film_to_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("We add the new film")
    public void we_add_the_new_film() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The new film should be added to the list")
    public void the_new_film_should_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    Category savedCategory;
    @Given("We have a new category to add")
    public void we_have_a_new_category_to_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("We add the new category")
    public void we_add_the_new_category() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The new category should be added to the list")
    public void the_new_category_should_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
