Feature: Calculator Application
  I want to CheckFunctionality of Calculator

  @ADD @Regression
  Scenario Outline: Adding Two single digit numbers
    Given Calculator App is open
    When I click on "<number1>"
    Then I click on plus sign "<sign>"
    Then I click on "<number2>"
    Then I click on Equals to sign "<esign>"
    Then I will check the "<answer>"

    Examples: 
      | number1 | sign | number2 | esign | answer |
      |       2 | +    |       2 | =     |      4 |

  @SUB @Regression
  Scenario Outline: Subtracting Two single digit numbers
    Given Calculator App is open
    When I click on "<number1>"
    Then I click on plus sign "<sign>"
    Then I click on "<number2>"
    Then I click on Equals to sign "<esign>"
    Then I will check the "<answer>"

    Examples: 
      | number1 | sign | number2 | esign | answer |
      |       2 | -    |       2 | =     |      0 |
      |       8 | -    |       7 | =     |      1 |
