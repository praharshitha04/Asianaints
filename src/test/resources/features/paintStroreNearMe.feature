Feature: paintStoreNearMe
Scenario: Validate the user is able to get the correct requred address when pincode is entered
Given Browser is Launched and url is navigated
And Handle the popUp
And User should  be hover on PaintsAndColours
And Click on Paint Store Near Me
When Pincode should be entered
And Click on search button
Then Address should be displayed
And Validate the address