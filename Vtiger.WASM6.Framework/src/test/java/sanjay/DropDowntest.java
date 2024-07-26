package sanjay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowntest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumQspiders\\Anirudh\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hari%20Prasad/OneDrive/Desktop/gmail.html");
		WebElement element = driver.findElement(By.id("Hotel taj"));
		Select sel = new Select(element);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("D");
		Thread.sleep(2000);
		sel.selectByVisibleText("CurdRice");
		Thread.sleep(4000);
		driver.quit();
		System.out.println("Successfull");
	}

}
