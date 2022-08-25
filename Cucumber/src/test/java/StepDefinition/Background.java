package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Background {

	@Given("the student has passed 10th")
	public void the_student_has_passed_10th() {
		System.out.println("the student has passed 10th");
	}

	@Then("the student has passed 12th")
	public void the_student_has_passed_12th() {
		System.out.println("the student has passed 12th");
	}

	@Given("The student has taken biology")
	public void the_student_has_taken_biology() {
		System.out.println("The student has taken biology");
	}

	@Given("the student has passed NEET")
	public void the_student_has_passed_neet() {
		System.out.println("The student has passed NEET");
	}

	@Then("the student can join medicine")
	public void the_student_can_join_medicine() {
		System.out.println("the student can join medicine");
	}

	@Given("The student has taken ComputerScience")
	public void the_student_has_taken_ComputerScience() {
		System.out.println("The student has taken ComputerScience");
	}

	@Given("the student has passed 12th with good marks")
	public void the_student_has_passed_12th_with_good_marks() {
		System.out.println("the student has passed 12th with good marks");
	}

	@Then("the student can join engineering")
	public void the_student_can_join_engineering() {
		System.out.println("the student can join engineering");
	}

}
