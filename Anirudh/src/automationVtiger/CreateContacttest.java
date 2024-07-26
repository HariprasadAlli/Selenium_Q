package automationVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateContacttest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		// open FB
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alli");
		
		
		
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		//logout
		
		Actions act = new Actions(driver);
		
		System.out.println("Successfull");
		
		
		

	}

}
