import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizing_Minimizing_Dimensions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(20, 40));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 300));
		Thread.sleep(2000);
		driver.close();
		System.out.println("Successfully closed");
	}
}
