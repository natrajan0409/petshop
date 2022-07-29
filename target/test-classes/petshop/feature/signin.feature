@signin
Feature: Create a new user if username and password not prsent in config file.



Scenario Outline: Register  new user if username and password not present in config file
Given user Nagivate to Sign page
When Click on Register NOw button
Then User information page displayed 
And Enter Required information "<sheetName>"                  
Then Click save account information Button

Examples:
|sheetName|
|Register|


Scenario: login with exising user account in property file
Given Login page displayed
When Enter username and password 
And click login button 
Then user landed on product page
 
 
@signin1
Scenario: login with exising user and added product to cart 
Given Login page displayed
When Enter username and password 
And click login button
And select the required product
And  Add the item to cart 


 