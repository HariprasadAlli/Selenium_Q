package Vtiger.Practice;

import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		String[] dArr = d.toString().split(" ");
		String month = dArr[1];
		String date = dArr[3];
		String year = dArr[5];
		String time = dArr[3];
		
		String dataFormat = date+"-"+month+"-"+year+"-"+time;
		System.out.println(dataFormat);
		
		
		
		

	}

}
