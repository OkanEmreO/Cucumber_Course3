Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to basqar
    When Enter username and password and clik login button
    Then User should login successfuly
    And Navigate to country page
    When Create a country
    Then Success message should be displayed