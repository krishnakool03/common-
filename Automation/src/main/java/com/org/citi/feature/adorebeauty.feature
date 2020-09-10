Feature: User should select Holiday Gift categories and print the final products in Adorebeauty.com
@giftsets0
Scenario:  buy gifts at adorebeauty and print the last product's price .
Given user log in Adorebeauty environment
When user navigates to Login page.
And User click the gift under menu tab 
Then click the giftsets in gift
Then select products ,age,ingredients and skin concern preferences and check the products
And click the giftsets in which selecet the final  Brands of the product
Then get the price for the chosen product


@makeupgifts
Scenario: shop makeup gifts module and print the last product's price
Given user log in Adorebeauty environment
When user navigates to Login page
And User click the gift under menu tab  
Then click the makeupgiftsets 
Then select the price ingredients preference which comes under Filter by
And deselect all the products which you are  selected 
Then get the price for the final product


