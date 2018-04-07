Feature: Register as new User
  @CucumberScenario
  Scenario: Register user
    When I am on Hackathon page
    And I click Create New Account
    Then I should see the customer registration page
    When I enter all the required reg details as "akshata987", "Akshati Patil", "akshata.malwad@tcs.com", "password", "100555678234", "9883345678"
    And I click reister button
    Then I should see the alert
    