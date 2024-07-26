import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]")).click();
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

	}

}
