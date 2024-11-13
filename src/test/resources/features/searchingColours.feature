Feature: searchingColours
Scenario Outline: Validate User is able to search the colours in SearchBar
Given Browser is Launched and url is navigated
And Handle the popUp
And User should hover and Click on PaintsAndColours
And Click on shopping cart icon
When Click on search
And Enter the <colourName> colour Name
And Click on see all results button
Then Related colourname colours should be displayed

Examples:
       | colourName |
       | 1 |
       | 2 |
       | 3 |
       