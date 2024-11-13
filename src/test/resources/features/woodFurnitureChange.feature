Feature: woodFurnitureChange
Scenario Outline: User should able to see the Wood Finish

Given Browser is Launched and url is navigated
And Handle the popUp
And Hover on Paints and Colours and click on Wood Finish Visualizer
And Scroll to Spaces with Wood Finish Text
When Click on Particular <Room>
And Click on Side Arrow and view the room
Then Room should be displayed 

Examples:
        | Room |
        | 1 |
        | 2 |
        | 3 |