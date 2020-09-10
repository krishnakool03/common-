Feature: To verify applicance and attic ladders in the navigation menu service
Background:
Given User login into lowes company 
When User navigate to serivce list in the navigation menu
Then User takes a look in all services provided

Scenario: To verify the Appliances and print them in the console 

And User choose Appliance from the list provided 
And User Prints the Appliances Lowe’s Will Install

Then User closes the browser 


Scenario: To check the attic ladder with popular attic lader categories and print first product in each category 

And User select the Attic lader from the list provided
Then User Scroll down to select the Popular Attic Lader category
And User Selects all the category given in the Popular Attic lader Category
Then User clicks all the checkbox in the Material list for all the choosen category 
And User prints the rate of the first product from all the category 
And User close all the open window. 

  



 