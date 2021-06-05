Feature: Application Login

  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "username" and "valid_password"
    Then Home page is populated
    And Cards are displayed


  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "username" and "invalid_password"
    Then Home page is populated
    And Cards are not displayed


 Scenario Outline: Home page default login outline
    Given User is on landing page
    When User login into application with parameters <username> and <password>
    Then Home page is populated
    And Cards are displayed
   Examples:
     |username  |password|
     |user1  |pass1|
     |user2  |pass2|
