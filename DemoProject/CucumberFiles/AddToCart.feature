  Feature: Add to cart button Functionality testing 
  
  Scenario: User will login with real data and will take a product in a cart and checkout . 
   
    Given user will be on the homepage
    When user will signin to account 
    And user will click on Hardware button
    And user will click on Printer
    And user will select a product
    And user will click on add to cart button 
    And user will click on checkout button
    And user will varify    
    Then user will close the browser

   
