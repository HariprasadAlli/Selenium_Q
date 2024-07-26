import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizing_Minimizing {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Browser closed successfull");
		driver.close();
		
		
		

	}

}
