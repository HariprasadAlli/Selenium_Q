import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\src\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.actitime.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Program successfully completed");
		driver.close();

	}

}
