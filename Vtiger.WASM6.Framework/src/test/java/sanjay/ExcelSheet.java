package sanjay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

		public static void main(String[] args) throws Exception		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
			//step2: create a workbook
			Workbook wb = WorkbookFactory.create(fis);
			
			//step3: navigate to required sheet
			Sheet sh = wb.getSheet("Contacts");
			
			//step4: navigate to required row inside the sheet
			Row rw = sh.getRow(4);
			
			//step5: navigate to required cell inside the row
			Cell ce = rw.getCell(3);
			
			//step6: read the Value present in that cell
			String value = ce.getStringCellValue();
			System.out.println(value);
		}
}
