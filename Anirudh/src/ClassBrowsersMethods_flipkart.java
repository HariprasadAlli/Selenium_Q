import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassBrowsersMethods_flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		// open FB
		driver.get("https://www.flipkart.com/");
		String srccode = driver.getPageSource();
		System.out.println(srccode);
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current Url is: " + currenturl);
		// driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		//driver.close();

	}

}
