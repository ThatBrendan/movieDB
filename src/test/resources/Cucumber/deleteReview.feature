Feature: Delete a new review for a movie I watched
  As a movie consumer I want to delete a review for a movie
  Scenario: A review was left incorrectly and needs to be deleted
    Given I want to delete an existing review
    When A new review is deleted
    Then the review should be removed from the movie it was left on