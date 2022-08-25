@BackgroundExample 
Feature: To explain use of background 
Background: The student must completed the education to go to clg 
	Given the student has passed 10th 
	Then the student has passed 12th 
@UAT	
Scenario: To study medicine 
	Given The student has taken biology 
	And the student has passed NEET 
	Then the student can join medicine 
@UAT	
Scenario: To study Engineering 
	Given The student has taken ComputerScience 
	And the student has passed 12th with good marks 
	Then the student can join engineering    