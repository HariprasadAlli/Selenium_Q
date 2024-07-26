package Vtiger.Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

		public static void main(String[] args) throws IOException
		{
			FileInputStream fs = new FileInputStream("D:\\SeleniumQspiders\\Vtiger.WASM6.Framework\\src\\test\\resources\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fs);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
			Row r = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0);
			Cell c = r.getCell(0);
			String data = c.getStringCellValue();
			System.out.println(data);
		}
}
