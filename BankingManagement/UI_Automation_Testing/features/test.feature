Feature: test
  
  Scenario: test
    When I am on Hackathon page
    Then I login as a "Customer" with credentials as username "akshata" and password "akshata"
    Then I should see Google logo