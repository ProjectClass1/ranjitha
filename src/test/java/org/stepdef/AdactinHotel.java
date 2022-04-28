package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	WebDriver driver;

	@Given("user is on Adactinhotel page on chrome browser.")
	public void user_is_on_Adactinhotel_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}

	@When("user enter username and password.")
	public void user_enter_username_and_password() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("welcome Alexa");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("567enjoy! ");

	}

	@When("user should click login button.")
	public void user_should_click_login_button() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@Then("user should verify homepage is displayed or not.")
	public void user_should_verify_homepage_is_displayed_or_not() {
		System.out.println("Invalid User Name");
	}

}
