Feature: Login in features demoqa.com
  As a user demoqa.com
  I want to see my profile
  So that I can see my username, userID and token

  Scenario: Login Blank Username and Password
    Given I am on the Login page
    When I enter username and Password Blank
    When I click 'execution' button in page
    Then I am stay in login page



  Scenario: Login Blank Password
    Given I am on the Login page
    When I enter my username correctly and Password Blank
    When I click 'execution' button with failed case
    Then Warning Password invalid and stay Sign in page



  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'execution' button
    Then I am taken to the dashboard