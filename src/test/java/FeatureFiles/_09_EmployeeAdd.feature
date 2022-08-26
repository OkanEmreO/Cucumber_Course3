Feature: Employee Outline Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and clik login button
    Then User should login successfuly

  Scenario Outline: Create and Delete Employe
    And Click on the element in the left Nav
      | humanResources  |
      | employees |
      | cookies   |


    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Employe Content
      |    firstName       |    <firstName>      |
      |    lastName        |    <lastName>       |
      |    birthDate       |    <birthName>      |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    Examples:
      | firstName | lastName | birthName | genderName   | employeName | employIDName  | qualificatName|
      | dsfsdf    | dsfdsf   | 10.03.1996  | Male         |  fsdsdg     | 125454        | sdgsdggr      |
      | firstName | lastName | birth     | PriorityName | employe     | employID      | qualificat    |
