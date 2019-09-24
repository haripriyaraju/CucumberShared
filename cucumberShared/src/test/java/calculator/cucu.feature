
@tag
Feature: Test calculator
  this file describe the calculator functionallty

  @tag1
  Scenario: add two number
    Given I enter 40 in the calculator
    And I press Add
    And I have entered 20 in the calculator
    When I press Equals
    Then The should be 60
   
 
