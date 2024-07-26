package dharani12OCT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\GLAMS\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(ele1.size());
		
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
		driver.close();
		
	}

}
