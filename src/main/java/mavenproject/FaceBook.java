package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("ranjitha");
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys("23451");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		
		
		
	}

}
