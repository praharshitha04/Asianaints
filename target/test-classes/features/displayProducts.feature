Feature: displayProducts
Scenario: Validate the user is able to see all the products

Given Browser is Launched and url is navigated
And Handle the popUp
And  Hover on Paints and Colours and Click on Interior Paints
When Click on Luxury Explore
And Display All Luxury products
Then Click on all
And All products should be displayed