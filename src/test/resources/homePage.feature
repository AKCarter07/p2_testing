Feature: Home Page

Scenario: Search by username
    Given I am on the home page
    When I type "Elwy" into the Search Users Box
    And I click the search users button
    Then I should be redirected to the user page
