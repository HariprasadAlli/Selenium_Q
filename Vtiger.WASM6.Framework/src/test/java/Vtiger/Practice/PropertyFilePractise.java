package Vtiger.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilePractise {

	public static void main(String[] args) throws IOException {
		
		
		//load the file into java stream
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		
		//create obj of properties
		Properties pobj = new Properties();
		
		//load the file input stream to properties
		pobj.load(fis);
		
		//use the keys to read the value
		String BROWSER = pobj.getProperty("browser");
		System.out.println(BROWSER);
		

	}

}
