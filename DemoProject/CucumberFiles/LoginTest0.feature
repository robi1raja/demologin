
  Feature: OS commerce login features testing
  Scenario Outline: User will put the valid data and will sign in successfully 
    Given User will be in the login page
    When User will input "<Email>" 
    And User will enter "<Password>" 
    And User will click on Signin button
    And User will varify 
    Then User will close the browser

    Examples: 
      | Email                     | Password |
      |  su1241057@gmail.com      |  test234 |
      
