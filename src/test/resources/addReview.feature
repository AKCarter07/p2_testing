Feature: Add Review

  Scenario: Add review to existing book
    Given I am logged in as test user
    And I am on the add review page for an existing book
    When I input a rating
    And I input a review
    And I click submit
    Then my review will be added to the book