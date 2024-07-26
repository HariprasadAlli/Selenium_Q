package Vtiger.Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContactTest {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

		// step2: create a workbook
		Workbook wb = WorkbookFactory.create(fis);

		// step3: navigate to required sheet
		Sheet sh = wb.getSheet("TestData");

		// step4: navigate to required row inside the sheet
		Row rw = sh.getRow(1);

		// step5: navigate to required cell inside the row
		Cell ce = rw.getCell(0);

		// step6: read the Value present in that cell
		String value = ce.getStringCellValue();
		System.out.println(value);
		
		Row rw1 = sh.getRow(1);

		// step5: navigate to required cell inside the row
		Cell ce1 = rw1.getCell(1);

		// step6: read the Value present in that cell
		String value1 = ce1.getStringCellValue();
		
		
		System.out.println(value1);
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys(value);

		driver.findElement(By.name("user_password")).sendKeys(value1);

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();

		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();

		driver.findElement(By.name("lastname")).sendKeys("Alli");

		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		System.out.println("Successfull");

	}

}
