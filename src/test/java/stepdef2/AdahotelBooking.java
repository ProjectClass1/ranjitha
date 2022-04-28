package stepdef2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdahotelBooking {
	public static WebDriver driver;

	@Given("user is on Adactinhotel application on chrome browser.")
	public void user_is_on_Adactinhotel_application_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter {string} and {string}.")
	public void user_enter_and(String string, String string2) {
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys(string);
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys(string);

	}

	@When("user should click login button.")
	public void user_should_click_login_button() {
		WebElement element3 = driver.findElement(By.id("login"));
		element3.click();
	
	}

	@When("user select {string},{string},{string},{string},{string},{string},{string}.")
	public void user_select(String string, String string2, String string3, String string4, String string5,
			String string6, String string7) {
		WebElement findelement = driver.findElement(By.id("location"));
		Select se = new Select(findelement);
		se.selectByValue(string);

		WebElement findelement1 = driver.findElement(By.id("room_type"));
		Select se1 = new Select(findelement1);
		se1.selectByValue(string2);

		WebElement findelement2 = driver.findElement(By.id("room_nos"));
		Select se2 = new Select(findelement2);
		se2.selectByValue(string3);

		WebElement findelement3 = driver.findElement(By.id("datepick_in"));
		Select se3 = new Select(findelement3);
		se3.selectByValue(string4);

		WebElement findelement4 = driver.findElement(By.id("datepick_out"));
		Select se4 = new Select(findelement4);
		se4.selectByValue(string5);

		WebElement findelement5 = driver.findElement(By.id("adult_room"));
		Select se5 = new Select(findelement5);
		se5.selectByValue(string6);

		WebElement findelement6 = driver.findElement(By.id("child_room"));
		Select se6 = new Select(findelement6);
		se6.selectByValue(string7);

	
	}

	@When("click continue button.")
	public void click_continue_button() {

		WebElement element4 = driver.findElement(By.id("Submit"));
		element4.click();


	}

	@When("user select hotel and click continue for booking.")
	public void user_select_hotel_and_click_continue_for_booking() {
		WebElement option = driver.findElement(By.id("radiobutton_2"));
		option.click();

		WebElement option2 = driver.findElement(By.id("continue"));
		option2.click();


	}

	@When("user enter{string},{string},{string},{string},{string},{string},{string},{string}.")
	public void user_enter(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		txtfirstname.sendKeys(string);

		WebElement txtlastname = driver.findElement(By.id("last_name"));
		txtlastname.sendKeys(string2);

		WebElement txtaddress = driver.findElement(By.id("address"));
		txtaddress.sendKeys(string3);

		WebElement txtnumber = driver.findElement(By.id("cc_num"));
		txtnumber.sendKeys(string4);

		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select sele = new Select(cardtype);
		sele.selectByValue(string5);

		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select sele1 = new Select(expmonth);
		sele1.selectByValue(string6);

		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select sele2 = new Select(expyear);
		sele2.selectByValue(string7);

		WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
		txtcvv.sendKeys(string);


	}

	@When("user click on continue for generating order id.")
	public void user_click_on_continue_for_generating_order_id() {
		WebElement submit = driver.findElement(By.id("book_now"));
		submit.click();

	}

	@When("user print order id to console.")
	public void user_print_order_id_to_console() {
		WebElement orderid = driver.findElement(By.id("order_no"));

		System.out.println("orderid is");

	}

}
