Feature: Validate the login Page
   Scenario: Checking user login with given data
    Given User launch the url
    When User enter the credentials "User123" and "pass123"
    And User click the login button
    Then validate the results
    