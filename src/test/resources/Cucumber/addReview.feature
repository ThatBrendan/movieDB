Feature: Add a new review for a movie I watched
  As a movie consumer I want to add a new review for a movie
  Scenario: My review isn't added to the movie I watched
    Given I want to add a new review
    When A new review is added
    Then the review should be added to the movie and saved