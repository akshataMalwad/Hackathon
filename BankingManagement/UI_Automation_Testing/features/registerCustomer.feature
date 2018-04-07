Feature: register
  @CucumberScenario
  Scenario: test
    When I am on Hackathon page
    And I click Create New Account
    Then I should see the customer registration page
    When I enter all the required details as "akshata", "Akshata Malwad", "akshata.malwad@gmail.com", "password", "123456789012", "9012345678"
    And I click reister button
    Then I should see Google logo