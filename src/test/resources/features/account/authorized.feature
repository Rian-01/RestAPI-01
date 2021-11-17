Feature: Authorized User in features demoqa.com
  As a user demoqa.com
  I want to see my Account
  So that i can authorized my account was true or false

  Scenario: Authorized account Blank Username and Password
    Given I am on the page Authorized
    When I enter my username and Password Blank
    And I click 'execution' button system
    Then I am stay in Authorized page


  Scenario: Authorized account Blank Password
    Given I am on the page Authorized
    When I enter my Password Blank
    And I click 'execution' button Authorized page
    Then Warning Password invalid and stay Authorized page


  Scenario: Authorized account is success
    Given I am on the page Authorized
    When I enter my username and Password is valid
    And I click 'execution' button in page system
    Then I am taken new page Authorized
