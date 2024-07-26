import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_With_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]/")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 7 (Gold, 32 GB)']")).click();
		driver.quit();
		
		System.out.println("Success");

	}

}
