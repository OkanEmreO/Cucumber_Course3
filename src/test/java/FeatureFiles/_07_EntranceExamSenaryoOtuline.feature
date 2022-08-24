Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and clik login button
    Then User should login successfuly

  Scenario Outline: Create and Delete a Exam
    And Click on the element in the left Nav
      | entranceExamOne  |
      | setupTwo |
      | entranceExamTwo  |
      | cookies |


    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Dialog content
      | nameInput  |  <ExamName>  |

    And Click on the element in the Form Content
      | academicPeriod  |
      | <AcademicPeriodOption> |
      | gradeLevel  |
      | <GradeLevelOption> |
    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamOne  |
      | setupTwo         |
      | entranceExamTwo  |


    And User delete item from Dialog
      | <ExamName> |

    Then Success message should be displayed
    Examples:
      | ExamName   | AcademicPeriodOption | GradeLevelOption |
      | IT exam is101 | academicPeriod2   | gradeLevel2      |
      | IT exam is102 | academicPeriod2   | gradeLevel2      |
      | IT exam is103 | academicPeriod2   | gradeLevel2      |
      | IT exam is104 | academicPeriod2   | gradeLevel2      |