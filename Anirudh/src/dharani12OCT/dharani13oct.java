package dharani12OCT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dharani13oct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele1.size());
		
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
		driver.close();
		
	}

}
