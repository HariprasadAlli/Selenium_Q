import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome_Browser {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Prasad\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		// open FB
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		System.out.println(driver.getTitle());
	}
}
