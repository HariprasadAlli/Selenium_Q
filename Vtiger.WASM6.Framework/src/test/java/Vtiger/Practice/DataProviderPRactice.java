package Vtiger.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPRactice {
	
	@Test(dataProvider="Phones")
	public void addProductToCartTest(String Name, String Model, int Price, int qty)
	{
		System.out.println(Name + Model + Price + qty);
	}

	@DataProvider(name = "Phones")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0]= "samsung";
		data[0][1]= "A80";
		data[0][2]= 25000;
		data[0][3]= 10;
		
		data[1][0]= "redmi";
		data[1][1]= "pro";
		data[1][2]= 15000;
		data[1][3]= 20;
		
		data[2][0]= "poco";
		data[2][1]= "M2";
		data[2][2]= 10000;
		data[2][3]= 100;

		return data;	
		
	}
}
