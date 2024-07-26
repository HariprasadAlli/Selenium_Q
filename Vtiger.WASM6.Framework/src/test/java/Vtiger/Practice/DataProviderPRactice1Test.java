package Vtiger.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPRactice1Test {

	@Test(dataProvider = "India")
	
	public void addIndustryType(String OrgName, String Industry)
	{
		System.out.println(OrgName + Industry);
	}
	
	@DataProvider(name = "India")
	public Object[][] getData()
	{
	 Object[][] data = new Object[2][2];
		
		data[0][0] = "Qspiders";
		data[0][1] = "HealthCare";
		
		data[1][0] = "all states";
		data[1][1] = "Education";
		
		
		
		
		
		
		
		
		
		
		return data;
		
	}
}
