Feature: Generate Token in features demoqa.com
  As a user demoqa.com
  I want to see Token User
  So that i can taken Token my account

  Scenario: Generate Token account Blank Username and Password
    Given I am on the GenToken page
    When I enter my Password is Blank
    When I click 'execution' in GenToken Page
    Then I am stay in GenToken page



  Scenario: Generate Token account Blank Password
    Given I am on the GenToken page
    When I enter username correctly and Password Blank
    When I click 'execution' with failed Pass
    Then Warning Password invalid and stay in page



  Scenario: Generate Token account is success
    Given I am on the GenToken page
    When I enter my username and Password valid
    And I click 'execution' button page
    Then I am taken to New Page
