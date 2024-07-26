package dharani11OCT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		// open FB
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("hari");
		driver.findElement(By.name("password")).sendKeys("hari");
		driver.findElement(By.xpath("//div[contains(@class,'qF0y9')])[3]")).click();
	}

}
