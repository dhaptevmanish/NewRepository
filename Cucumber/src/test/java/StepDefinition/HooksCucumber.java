//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class HooksCucumber {
//
////	@Given("User is on google search page")
////	public void user_is_on_google_search_page() {
////		System.out.println("User is on google search page");
////	}
////
////	@Then("user enters search text")
////	public void user_enters_search_text() {
////		System.out.println("user enters search text");
////
////	}
////
////	@And("User presses enter to see the search results")
////	public void user_presses_enter_to_see_the_search_results() {
////		System.out.println("User presses enter to see the search results");
////
////	}
//
//// We can use annotations, hooks here in step def file also but preferably we can write it in a seperate class file and glue it in runner class
//	
//	// Annotations that are empty () takes the highest priority
//	
//	@Before ()
//	@Given("User is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("User is on google search page");
//	}
//	@Before ()
//	@Then("user enters search text")
//	public void user_enters_search_text() {
//		System.out.println("user enters search text");
//	   
//	}
//	@After ()
//	@And("User presses enter to see the search results")
//	public void user_presses_enter_to_see_the_search_results() {
//		System.out.println("User presses enter to see the search results");
//	    
//	}
//
//	@Before ("@First")
//	@Given("User is on google1 search page")
//	public void user_is_on_google1_search_page() {
//		System.out.println("User is on google1 search page");
//	}
//	@Before ("@First")
//	@Then("user enters search1 text")
//	public void user_enters_search1_text() {
//		System.out.println("user enters search1 text");
//	   
//	}
//	@After ("@First")
//	@And("User presses enter to see the search1 results")
//	public void user_presses_enter_to_see_the_search1_results() {
//		System.out.println("User presses enter to see the search1 results");
//	    
//	}
//	
//	
//}
