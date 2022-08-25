@LoginScenarios
Feature: Cucumber practice

@ExampleTest
Scenario Outline: Logging into OrangeHR portal 
Given login page of OrangeHR portal  
When  User enters username <username> and password <password>

# here first | acts like { in the start of a string array, second | acts like ,(comma) to seperate one element from the other 
# and the last | acts like the } (Close phrase) that like to close a string
And  Clicking the login button 

Examples: 
|username | password|
|admin | admin123|

