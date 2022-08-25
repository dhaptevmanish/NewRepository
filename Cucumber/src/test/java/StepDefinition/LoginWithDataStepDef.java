package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginWithDataStepDef {
	WebDriver driver;	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("user enters login credentials {string} and {string}")
	public void user_enters_login_credentials_and(String username, String Password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("the user must be logged in")
	public void the_user_must_be_logged_in() {

		boolean status = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);
		//System.out.println("Logged in to the portal"+linktext);
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.quit();
	}

}
