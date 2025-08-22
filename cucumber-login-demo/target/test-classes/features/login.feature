Feature: Login
  As a user
  I want to log into the site
  So that I can access my secure area

  Background:
    Given I am on the login page

  # Uses the-internet.herokuapp.com known test login
  Scenario: Successful login and logout
    When I login with username "tomsmith" and password "SuperSecretPassword!"
    Then I should see a success message
    When I logout
    Then I should be back on the login page

  Scenario Outline: Invalid login shows an error message
    When I login with username "<user>" and password "<pass>"
    Then I should see an error message

    Examples:
      | user     | pass                  |
      | wrong    | SuperSecretPassword!  |
      | tomsmith | wrong                 |
      | wrong    | wrong                 |
