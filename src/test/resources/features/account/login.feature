Feature: Login
  As a LinkedIn user
  I want to see my timeline
  So that I can like or comment my connections post

  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and password correctly
    And I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login Failed
    Given I am on the Login page with case invalid password
    When I enter my valid username and invalid password
    And I click 'Login' button with case invalid password
    Then I can see error message invalid password