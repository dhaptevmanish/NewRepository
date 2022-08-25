package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithHeader {

	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("User enters the login credentials")
	public void user_enters_the_login_credentials(io.cucumber.datatable.DataTable dataTable) {
// since the input is like a keyvalue pair we will be using maps concept here 

		List<Map<String, String>> keyvaluepair = dataTable.asMaps(String.class, String.class);
		// List<Map<String,String>> is the return type for the element keyvalue pair
		String user_name = keyvaluepair.get(0).get("username");
		String pass_word = keyvaluepair.get(0).get("password");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user_name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass_word);
	}

	@When("^You Click on the login button$")
	public void you_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.quit();

	}
}
