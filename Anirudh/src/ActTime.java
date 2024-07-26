import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(300, 400));
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(300, 400));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(100, 350));
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com/");
		Navigation n = driver.navigate();
		Thread.sleep(1000);
		n.back();
		Thread.sleep(1000);
		System.out.println("Successfull");
		driver.close();
	}

}
