Feature: login
Scenario: User should able to loginin and singnup
Given Browser is Launched and url is navigated
And Handle the popUp
And Click on Login icon 

When Enter Phonenumber of ten Digits
And Click on proceed
And Fill all the Details
Then Click on Proceed to SignUp
And Validate the login 