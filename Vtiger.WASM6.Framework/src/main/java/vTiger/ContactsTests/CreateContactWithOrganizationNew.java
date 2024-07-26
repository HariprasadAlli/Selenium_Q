package vTiger.ContactsTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTiger.GenericLibrary.ExcelFileLibrary;
import vTiger.GenericLibrary.JavaLibrary;
import vTiger.GenericLibrary.PropertyFileLibrary;
import vTiger.GenericLibrary.WebDriverLibrary;
import vTiger.ObjectRepository.ContactsInfoPage;
import vTiger.ObjectRepository.ContactsPage;
import vTiger.ObjectRepository.CreateNewContactPage;
import vTiger.ObjectRepository.CreateNewOrganizationPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LoginPage;
import vTiger.ObjectRepository.OrganizationsInfoPage;
import vTiger.ObjectRepository.OrganizationsPage;

public class CreateContactWithOrganizationNew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1:create object of all the libraries
				JavaLibrary jLib=new JavaLibrary();
				PropertyFileLibrary pLib=new PropertyFileLibrary();
				ExcelFileLibrary eLib=new ExcelFileLibrary();
				WebDriverLibrary wLib=new WebDriverLibrary();
				
				//step 2:read all the required data
				String BROWSER = pLib.readDataFromPropertyFile("browser");
				String URL = pLib.readDataFromPropertyFile("url");
				String USERNAME = pLib.readDataFromPropertyFile("username");
				String PASSWORD = pLib.readDataFromPropertyFile("password");
				
				String LASTNAME = eLib.readDataFromExcel("Contacts", 4, 2)+jLib.getRandomNumber();
				String ORGNAME = eLib.readDataFromExcel("Contacts", 4, 3)+jLib.getRandomNumber();
				
				WebDriver driver=null;
				
				//step 3:launch the browser
				if(BROWSER.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				else if(BROWSER.equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
				else
				{
					System.out.println("Invalid Browser Name");
				}
				
				wLib.maximiseWindow(driver);
				wLib.waitForPageLoad(driver);
				driver.get(URL);
				
				//step 4:login to application
				LoginPage lp=new LoginPage(driver);
				lp.loginToApp(USERNAME, PASSWORD);
				
				//step 5:navigate to organizations link
				HomePage hp=new HomePage(driver);
				hp.clickOrganizationsLnk();
				
				//step 6:navigate to create organizations look up image
				OrganizationsPage op=new OrganizationsPage(driver);
				op.clickOnCreateOrgImg();
				
				//step 7:create new organization and save
				CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
				cnop.createNewOrg(ORGNAME);
				
				//step 8:validate for organization
				OrganizationsInfoPage oip=new OrganizationsInfoPage(driver);
				String orgHeader = oip.getOrgHeader();
				if(orgHeader.contains(ORGNAME))
				{
					System.out.println(orgHeader);
					System.out.println("Organization created successfully");
				}
				else
				{
					System.out.println("Organization not created");
				}
				
				//Step 9: Navigate to contacts link
				hp.clickContactsLnk();
				
				//step 10:navigate to create contact look up image
				ContactsPage cp=new ContactsPage(driver);
				cp.clickOnCreateContactImg();
				
				//step 11:create contact with mandatory fields
				CreateNewContactPage cncp = new CreateNewContactPage(driver);
				cncp.createNewContact(LASTNAME, ORGNAME, driver);
				
				//Step 12: Validate for Contact
				ContactsInfoPage cip = new ContactsInfoPage(driver);
				String contactHeader = cip.getContactHeader();
				if(contactHeader.contains(LASTNAME))
				{
					System.out.println(contactHeader);
					System.out.println("Pass");
				}
				else
				{
					System.out.println("FAIL");
				}
				
				//Step 14: logout of Application
				hp.signOutOfApp(driver);
	}
}

