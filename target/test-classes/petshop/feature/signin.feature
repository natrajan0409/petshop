@signin
Feature: Create a new user if username and password not prsent in config file.


@signin1
Scenario Outline: Register  new user if username and password not present in config file
Given user Nagivate to Sign page
When Click on Register NOw button
Then User information page displayed 
And Enter Required information "<sheetName>"                  
And Click save  account information Button

Examples:
|sheetName|
|Register|