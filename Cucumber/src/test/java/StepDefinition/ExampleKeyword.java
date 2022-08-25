package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExampleKeyword {
	WebDriver driver;

	@Given("login page of OrangeHR portal")
	public void login_page_of_orange_hr_portal() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("^User enters username (.+)  and password (.+) $")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);

	}

	@And("Clicking the login button")
	public void clicking_the_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

}
