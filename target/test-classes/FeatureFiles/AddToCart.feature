Feature: Add to cart feature
Scenario: Add to cart verification
Given User launches the URL
When User enters the "standard_user" and "secre_sauce"
And User clicked the login Btn
And User clicked the add to cart for any one of the product
Then User should see the product count in the cartbadge

