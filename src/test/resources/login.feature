Feature: Login Page

  Scenario: Valid username and password
    Given I am on the login page
    When I type "Bren" into the username input
    And I type "tabaxi" into the password input
    And I click the login button
    Then I should be redirected to the home page


