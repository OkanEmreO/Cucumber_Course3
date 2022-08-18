Feature:  Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and clik login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And Click on close button

    Examples:
      | CitizenshipName | ShortName |
      | vatanis19       | vatis19   |
      | vatanis20       | vatis20   |
      | vatanis30       | vatis30   |
      | vatanis40       | vatis40   |
      | vatanis50       | vatis50   |