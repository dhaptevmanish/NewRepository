package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithoutHeader {
	WebDriver driver;

	@Given("^You are on the login page$")
	public void you_are_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^You enter the login credentials$")
	public void you_enter_the_login_credentials(DataTable dataTable) {
		List<String> credentials = dataTable.transpose().asList(String.class);
		
		// here transpose fn is used to convert the datatable into strings 
		String username = credentials.get(0);
		String password = credentials.get(1);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}

	@When("^You Click on login button$")
	public void you_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.quit();
	}


}
