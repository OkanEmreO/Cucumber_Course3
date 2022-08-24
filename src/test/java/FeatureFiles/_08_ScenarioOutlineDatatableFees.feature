#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.

Feature: Fees Outline Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and clik login button
    Then User should login successfuly

  Scenario Outline: Create and Delete a Fee
    And Click on the element in the left Nav
      | setup   |
      | Parameters |
      | Fees  |
      | cookies |


    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Dialog content
      |    nameInput       |    <ExamName>      |
      |    codeInput       |    <CodeName>      |
      |  IntegrationCode   |   <IntegrationName> |
      |    priority        |   <PriorityName>    |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog
      | <ExamName> |

    Then Success message should be displayed
    Examples:
      | ExamName | CodeName | IntegrationName | PriorityName |
      | onese      |  111      | paypalPaye       |     1267      |
      | two      |  22      | masterpay       |     250      |
      | tree     |  33      | mastertwopay    |     375      |
      | four     |  44      | paypaltwopay    |     400      |


