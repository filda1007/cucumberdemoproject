Feature: To test facebook login

  Scenario: Verification of successful login when inputs were correct
    Given user on the login page
    When user enter the login page
    And  user enter valid username
    And user enter valid password
    Then user click on login button and login should be successful

