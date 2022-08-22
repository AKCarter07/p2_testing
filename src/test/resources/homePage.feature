Feature: Home Page

Scenario: Search by username
    Given I am on the home page
    When I type "Elwy" into the Search Users Box
    And I click the search users button
    Then I should be redirected to the user page


Scenario: Search by isbn
    Given I am on the home page
    When I type "9780786966912" into the Search by Isbn Box
    And I click the search by isbn button
    Then I should be redirected to the book page
