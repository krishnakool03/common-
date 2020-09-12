Feature: To verify applicance and attic ladders in the navigation menu service
Background:
Given User login into lowes environment
When User navigate to serivce list in the navigation menu
Then User takes a look in all services provided

@appliance
Scenario: To verify the Appliances and validate them in the console

And User choose Appliance from the Service list provided
And User validates the text Appliances Lowe’s Will Install
Then User log out of lowes environment   

@aluminiumatticladder
Scenario: To check the Aluminium attic ladder from the  popular attic lader category  

And User select the Attic lader from the Service list provided
And User Selects Aluminium Attic stairs from the category given in the Popular Attic lader Category list
Then User clicks all the checkbox in the Material list
And User validates the rate of the first product from the aluminium attic category
And User logout of the lowes environment                        

 
@steelatticstairs
 Scenario: To Check the steel attic stairs from the popular attic lader category
 
And User select the Attic lader from the service list provided
And User Selects Steel Attic stairs from the category given in the Popular Attic lader Category
Then User clicks all the checkbox in the Material list
And User validates the rate of the first product from the category
And User logout of the lowes environment 

@woodattcstairs
Scenario: To check the wood attic stairs from the popular attic ladder category

And User select the Attic lader from the service list provided
And User Selects steel Attic stairs from the category given in the Popular Attic lader Category
Then User clicks all the checkbox in the Material list
And User validates the rate of the first product from the category
And User logout of the lowes environment



@allatticstairs
Scenario: To check the All attic stairs from the popular attic ladder category

And User select the Attic lader from the service list provided
And User Selects All Attic stairs from the category given in the Popular Attic lader Category
Then User clicks all the checkbox in the Material list
And User validates the rate of the first product from the category
And User logout of the lowes environment