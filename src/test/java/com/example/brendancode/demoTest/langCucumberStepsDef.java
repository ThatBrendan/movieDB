package com.example.brendancode.demoTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class langCucumberStepsDef {



    @Given("We have a new language to add")
    public void we_have_a_new_language_to_add() {
        try{
        System.out.println("I am here");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @When("We add the new language")
    public void we_add_the_new_language() {
        try {
            System.out.println("Abu is here");
            // Write code here that turns the phrase above into concrete actions
//            throw new io.cucumber.java.PendingException();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    @Then("The new language should be added to the list")
    public void the_new_language_should_be_added_to_the_list() {
        try {
            System.out.println("Why always serious");
            // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
