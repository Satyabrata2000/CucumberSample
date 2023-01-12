Feature: Login

  Scenario: Login verification
    Given User navigates to the website amazon.com
    And User logs in through Login window by using Username as "User" and Password as "Password"
    Then Login should be successful