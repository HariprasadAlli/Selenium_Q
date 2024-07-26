package sanjay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownALphabetical {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Prasad\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize window using manage() method
		driver.manage().window().maximize();
		// open FB
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(element);
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> option = sel.getOptions();
		for (WebElement webEle : option) 
		{
			String altext = webEle.getText();
			list.add(altext);
		}
		Collections.sort(list);
		for (String sortedText : list) 
		{
			System.out.println(sortedText);
		}
	}
}