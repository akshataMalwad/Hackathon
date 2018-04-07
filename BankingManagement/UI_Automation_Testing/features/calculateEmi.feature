Feature: Calculate EMI
  @CucumberScenario
  Scenario: calculate EMI
    When I am on Hackathon page
    And I click EMI calculator
    Then I should see the EMI Calculator Page in new tab
    When I enter all the required details as "2000", "24"
    And I click Calculate EMI button
    Then I should see the EMI value "90.77" on screen
