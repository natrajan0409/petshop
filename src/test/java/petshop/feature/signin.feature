@signin  @smoke
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
Given user Nagivate to Sign page
When Enter username and password 
And click login button 
Then user landed on product page
 
 
 
@TEST001
Scenario Outline: login with exising user and added product to cart 
Given user Nagivate to Sign page
When Enter username and password 
And click login button
And select product based on user requirement "<Product>"
And Select Product based on user required product Types  "<Product>" and "<subproduct>"
And Select Product sub category   based on requirement "<Product>" "<subproduct>" and "<sub_category>"
And Add the item to cart 
And click on Proceed to checkout btn 
Then Payment page Displayed 
When Click on contiune btn 
And Click on confirm 
Then they can see order submitted msg 
When  Click on Signout btn 
Then user landed on product page

Examples:
|Product|subproduct|sub_category|
|FISH   |Koi       |Spotted Koi|
 