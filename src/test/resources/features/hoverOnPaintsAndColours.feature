Feature: hoverOnPaintsAndColours
Scenario: Validate the user is able to hover on the PaintsAndColours
Given Browser is Launched and url is navigated
And Handle the popUp
When User should hover on PaintsAndColours
Then All Options should be displayed