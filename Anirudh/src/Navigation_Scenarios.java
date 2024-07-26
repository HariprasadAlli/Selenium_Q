import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Scenarios {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("");
		Navigation n = driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);
		n.refresh();
		Thread.sleep(2000);
		n.refresh();
	}
}
