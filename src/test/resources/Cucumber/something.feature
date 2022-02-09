Feature: Is it Mandarin?
  As a consumer
  I want to check if a movie is in Mandarin
  So that i can understand the movie.
  Scenario: Language is not Mandarin
    Given I have selected a film
    When Film is not in "Mandarin"
    Then I would like to see all available languages