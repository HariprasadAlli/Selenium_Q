package broswerextensions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_chrome_amazon {
     //step--1  create a main method
	public static void main(String[] args) {
		// step--2  do the configuration to access chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM-KCSE6\\chromedriver.exe");
		// step-3 create an object of chrome driver
		ChromeDriver driver = new ChromeDriver();
		// step-4 access to a particular website
		driver.get("https://www.amazon.com/");
		// step--5 to print the title of webpage
        String title = driver.getTitle();
        System.out.println("title is :"+title);
        // step--6 to print the front end source code
        String srccode = driver.getPageSource();
        System.out.println("srccode");
        // step--7 to print current url
        String currenturl = driver.getCurrentUrl();
        System.out.println("current url is : "+currenturl);
        // step--8 to close the browser
        driver.close();
       
	}

}