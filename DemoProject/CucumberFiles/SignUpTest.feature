Feature: osCommerce Signup features testing

  Scenario Outline: User will provide all the real informations to signup in the website
    Given User will on the homepage
    When User will click on MyAccount button
    And User will click Continue button
    And User will select Male radio button 
    And User will enter "<FirstName>"  "<LastName>"  "<DateOfBirth>"  
    And User will put "<EMail>"  "<Street>"  "<PostCode>"  "<City>" 
    And User will input "<State>"  "<CountryName>"  "<Telephone>"   
    And User will put "<Password>"  "<CPassword>" 
    And User will click on continue
    And User will varify the page
    Then User will close the Browser

    Examples: 
      | FirstName  | LastName |DateOfBirth|  EMail             | Street           | PostCode | City     |State|  CountryName|Telephone | Password | CPassword |
      | test2      | test@2   | 12/10/1991| me123456g@gmail.com| 142 w 7th street | 11204 | Brooklyn    |NY   | India  |123456784 |  test234 | test234   | 
     