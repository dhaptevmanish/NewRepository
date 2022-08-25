@LoginScenarios
Feature: Cucumber practice

@Testing
Scenario: Log into the OrangerHR portal 
Given User is on the login page 
When User enters the login credentials
|username|password|
|admin|admin123|
# here we are including the title/header name just like an array format

# here first | acts like { in the start of a string array, second | acts like ,(comma) to seperate one element from the other 
# and the last | acts like the } (Close phrase) that like to close a string
And You Click on the login button 