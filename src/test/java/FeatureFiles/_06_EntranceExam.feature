Feature: Exam Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and clik login button
    Then User should login successfuly

    Scenario: Create a Exam
      And Click on the element in the left Nav
        | entranceExamOne  |
        | setupTwo |
        | entranceExamTwo  |
        | cookies |


      And Click on the element in the Dialog
        | addButton  |

      And User sending the keys in Dialog content
        | nameInput  |  ismetCountry1834  |

      And Click on the element in the Form Content
        | academicPeriod  |
        | academicPeriod2 |
        | gradeLevel      |
        | gradeLevel2     |
      And Click on the element in the Dialog
        | saveButton |

      Then Success message should be displayed

      And Click on the element in the left Nav
        | entranceExamOne  |
        | setupTwo         |
        | entranceExamTwo  |


      And User delete item from Dialog
        | ismetCountry182 |

      Then Success message should be displayed

