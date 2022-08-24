Feature: User Page

  Scenario: Go to book page for reviewed book
    Given I am on a valid user page
    When I click on the title of a book that has been reviewed
    Then I will be redirected to the page for that book