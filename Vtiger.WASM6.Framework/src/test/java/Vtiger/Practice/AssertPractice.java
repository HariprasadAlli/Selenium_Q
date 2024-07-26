package Vtiger.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {
	
	@Test
	public void demoTest() {
		SoftAssert sa = new SoftAssert();
		
	System.out.println("Step1");
	
	System.out.println("Step2");
	sa.assertEquals(10, 9);
	
	System.out.println("Step3");
	sa.assertTrue(false);
	
	System.out.println("Step4");
	sa.assertAll();
	}

	@Test
	public void demo() {
		
		
		SoftAssert sa = new SoftAssert();
			
		System.out.println("Step1");
		sa.assertTrue(false);
		
		System.out.println("Step2");
		Assert.assertTrue(false);
		
		System.out.println("Step3");
		sa.assertTrue(false);
		
		System.out.println("Step4");
		sa.assertAll();
		}
	}

