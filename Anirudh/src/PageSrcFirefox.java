import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSrcFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// URL launch
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// get page source
		String p = driver.getPageSource();
		System.out.println("Page Source is : " + p);
		driver.close();
	}
}