Feature: Logout as <Role>
  @CucumberScenario
  Scenario Outline: Logout <Role>
    When I am on Hackathon page
    And I login as a "<Role>" with credentials as username "<UserName>" and password "<Password>"
    Then I should see the "<Page>"
    When I click SignOut
    Then I should see the Login page

  Examples:
    |Role    |UserName|Password|Page              |
    |Customer|akshata |akshata |Customer home page|
    |Admin   |admin   |admin   |Admin home page   |