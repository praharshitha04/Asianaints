Feature: expandFAQ
Scenario: Validate the user is able to navigate to FAQ and expand the Question
Given Browser is Launched and url is navigated
And Handle the popUp
And  Hover on Paints and Colours and Click on Interior Paints
And Scroll down till the FAQ WebElement
When Click on plus icon
Then Summery should be displayed

	