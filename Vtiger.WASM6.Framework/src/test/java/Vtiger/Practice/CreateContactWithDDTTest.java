package Vtiger.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithDDTTest {
	
	@Test

	public void CreateContactWithDDT() throws IOException {

		// Step 1: read the required data
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		// Step1: read the file  and load into file input stream
				FileInputStream fis1 = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
				
				//step2: create a workbook
				Workbook wb = WorkbookFactory.create(fis1);
				
				//step3: navigate to required sheet
				Sheet sh = wb.getSheet("Contacts");
				
				//step4: navigate to required row inside the sheet
				Row r1 = sh.getRow(1);
				
				//step5: navigate to required cell inside the row
				Cell c1 = r1.getCell(2);
				
				String LASTNAME = c1.getStringCellValue();


		WebDriver driver = null;

		// Step 2: Launch the browser - RUN TIME POLYMORPHISM
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("=== " + BROWSER + " is launched ===");
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("=== " + BROWSER + " is launched ===");
		} else {
			System.out.println("invalid Browser name");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);

		// Step 3: Login to the application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// Step 4: Navigate to contacts link
		driver.findElement(By.linkText("Contacts")).click();

		// Step 5: create contact with mandatory fields
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(LASTNAME);

		// step 6: save
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		// logout
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

		driver.findElement(By.linkText("Sign Out")).click();

	}

}
