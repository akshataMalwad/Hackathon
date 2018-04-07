Feature: Login as Customer
  @CucumberScenario
  Scenario Outline: Login Customer
    When I am on Hackathon page
    And I login as a "<Role>" with credentials as username "<UserName>" and password "<Password>"
    Then I should see the "<Page>"
  Examples:
    |Role    |UserName|Password|Page              |
    |Customer|akshata |akshata |Customer home page|
    |Admin   |admin   |admin   |Admin home page   |
    