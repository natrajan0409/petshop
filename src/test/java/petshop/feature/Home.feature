@jpethome1
Feature: Go to  the Jpetstore   user landed on Welcome to JPetStore 6

@jpethome
Scenario: Enter Jpetstore URl and verify the tile 
Given User landed on Jpetstore
When user gets the title of the page
And click On Enter the store link 
Then page title should be "Sign In"