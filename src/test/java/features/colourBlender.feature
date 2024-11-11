Feature: colourBlender

Scenario: Validate the user is able to pick the colours and Click on TryOut now
Given Browser is Launched and url is navigated
And Handle the popUp
And User should hover on PaintsAndColours
And Click on DiscoverMeraWalaShades
And Click on Lets Find Your Shade Button
When Click on Creative and Fasionista
And Click on Lets dive in button
Then Colour Picker page should be displayed
