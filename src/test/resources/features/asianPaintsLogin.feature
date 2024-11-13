Feature: login
Scenario: User should able to login
Given Browser is Launched and url is navigated
And Handle the popUp
And Click on Login icon 
When Enter Phonenumber of ten Digits
And Click on proceed
And Validate the login 