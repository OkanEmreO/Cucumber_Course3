Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and clik login button
    Then User should login successfuly

    Scenario: Create Country
      And Click on the element in the left Nav
        | setup   |
        | Parameters |
        | Countries  |
        | cookies |


      And Click on the element in the Dialog
        | addButton  |

      And User sending the keys in Dialog content
        | nameInput  |  ismetCountry1  |
        | codeInput  |  1231353        |

      And Click on the element in the Dialog
        | saveButton |

      And Success message should be displayed

    Scenario: Create a Nationality
      And Click on the element in the left Nav
        | setup   |
        | Parameters |
        | nationalities  |
        | cookies |


      And Click on the element in the Dialog
        | addButton  |

      And User sending the keys in Dialog content
        | nameInput  |  ismetNat18  |
      And Click on the element in the Dialog
        | saveButton |

      And Success message should be displayed

    Scenario: Delete a Nationality
      And Click on the element in the left Nav
        | setup   |
        | Parameters |
        | nationalities  |
        | cookies |

      And Click on the element in the Dialog
        | addButton  |
      And User sending the keys in Dialog content
        | nameInput  |  ismetNat18  |
      And Click on the element in the Dialog
        | saveButton |
      And Success message should be displayed

      And User delete item from Dialog
        | ismetNat18  |

      And Success message should be displayed

  Scenario: Create a Fees
    And Click on the element in the left Nav
      | setup   |
      | Parameters |
      | Fees  |
      | cookies |

    And Click on the element in the Dialog
      | addButton  |
    And User sending the keys in Dialog content
      | nameInput       |  ismetNat18  |
      | codeInput       |  ismt123     |
      | IntegrationCode |  ismt123     |
      | priority        |    18         |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    And User delete item from Dialog
      | ismetNat18  |

    And Success message should be displayed

  Scenario: Delete a Fees
    And Click on the element in the left Nav
      | setup   |
      | Parameters |
      | Fees  |
      | cookies |

    And Click on the element in the Dialog
      | addButton  |
    And User sending the keys in Dialog content
      | nameInput  |  ismetNat18  |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

    And User delete item from Dialog
      | ismetNat18  |

    And Success message should be displayed