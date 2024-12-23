Feature: Title of your feature
  I want to use this template for my feature file
 Scenario Outline: Login with correct username and password
    Given I visited tutorialsninja website
    And click myAccount 
    When we can see login button and click
    And enter "<username>" and "<password>"
    Then I clicked login button
    And login status with "<login>"
    
Examples:
|username  | password  |login|
|sandhiyashikshaa@gmail.com | 12345 | success|
|sandhiyashikshaa@gmail.com | 54321 | Fail|
|sandhiyashiksha123a@gmail.com | 12345 | Fail|
    