@LoginScenarios
Feature: Cucumber practice

@FeatureTest
Scenario: Logging into portal 
Given You are on the login page 
When You enter the login credentials
|admin|admin123|
# here first | acts like { in the start of a string array, second | acts like ,(comma) to seperate one element from the other 
# and the last | acts like the } (Close phrase) that like to close a string
And You Click on login button 
