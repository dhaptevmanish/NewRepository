@LoginScenarios
Feature: Cucumber practice

@Functional @Sanity
Scenario: Login to portal scenario
Given user is on login page 
When user enters login credentials "admin" and "admin123" 
And Clicks on login button 
Then the user must be logged in