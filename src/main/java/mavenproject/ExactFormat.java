package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExactFormat {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		File file = new File("C:\\Users\\PriyaVenkatesan\\eclipse-workspace\\Login\\target\\excel\\demo.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Test");
 
         WebElement sel= driver.findElement(By.id("skills"));
             Select select=new Select(sel);
List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
			createCell.setCellValue(text);

			FileOutputStream stream1 = new FileOutputStream(file);
			workbook.write(stream1);

		}

	}
}
