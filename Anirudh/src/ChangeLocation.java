import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeLocation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//minimize window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// change dimensions
		driver.manage().window().setSize(new Dimension(20, 40));
		Thread.sleep(4000);
		//change Location
		driver.manage().window().setPosition(new Point(100, 200));
		driver.close();
		System.out.println("Windows Closed successfully");
	}

}
