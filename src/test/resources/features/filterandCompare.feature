Feature: filterAndCompare

Background:
Given Browser is Launched and url is navigated
And Handle the popUp
And Click on shopping cart icon
When Click on Shop now
And Scroll the page till Interior walls
And Click on Interior walls
And Click on view all products


Scenario: User should able to Select Multiple filters
Given Click on Filters 
When Click on Range button
And Options should be displayed
And Click on Primium Option
And Click on Apply
Then Primium Products should be displayed

Scenario:  User should able to Compare the products
Given Click on Compare
And Click on compare button of Royale Aspira
And Click on compare button of Royale Glitz
When Click on Compare Now button
Then Products comparisions should be displayed

 