package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {

	ChromeDriver driver;

	@Given("User navigates to login page")
	public void invokeBrowserAndNavigateToUrl() {

		System.setProperty("webdriver.chrome.driver", "/home/saurabhd2106gma/Desktop/libs/chromedriver");

		driver = new ChromeDriver();

		// Maximize the browser's screen
		driver.manage().window().maximize();

		// Bypass all the existing cookies
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4");

	}

	@When("user enters the userid as mngr291840")
	public void enterUserId() {
		WebElement userIdElement = driver.findElementByName("uid");

		userIdElement.clear();

		// Performing an action
		userIdElement.sendKeys("mngr291840");
	}

	@When("user enters the password as  dYnusAv")
	public void user_enters_the_password_as_d_ynus_av() {
		driver.findElement(By.name("password")).sendKeys("dYnusAv");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("user successfully logins to the application")
	public void user_successfully_logins_to_the_application() {
		System.out.println("User Successfully logged in");
	}

}
