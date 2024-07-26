import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_FireFox_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=RgFREgOgSlE");
		System.out.println(driver.getTitle());
		System.out.println("Successfull");
		//driver.close();

	}

}
