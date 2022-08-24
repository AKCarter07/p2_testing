Feature: Book Page

  Scenario: Go to add review page
    Given I am on the page for a book in the database
    When I click the add review button
    Then I should be redirected to the add review page

  Scenario: Go to user page for reviewer
    Given I am on the page for a book in the database
    When I click on the name of a reviewer
    Then I should be redirected to the user page