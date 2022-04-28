package org.stepdef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	static WebDriver driver;

	@Given("user is on facebook applicaton on chrome browser")
	public void user_is_on_facebook_applicaton_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter {string}and{string}")
	public void user_enter_and(String string, String string2) {
		WebElement e2 = driver.findElement(By.id("email"));
		e2.sendKeys(string);
		WebElement e3 = driver.findElement(By.id("pass"));
		e3.sendKeys(string2);

	}

	// @When("user should click login button")
	// public void user_should_click_login_button() {
	// WebElement element = driver.findElement(By.name("login"));
	// element.click();
	// }

	@Then("user should  verify home page is present")
	public void user_should_verify_home_page_is_present() {
		System.out.println("InvalidUserName");

	}

}
