package StepDefinition;

import io.cucumber.java.en.Given;

public class Scenario {
	
	@Given("{string} has scored {int} percentage")
	public void has_scored_percentage(String string, Integer int1) {
	   System.out.println(string+" "+"has scored"+int1);
		
	}
}

// \"(.*?)\"