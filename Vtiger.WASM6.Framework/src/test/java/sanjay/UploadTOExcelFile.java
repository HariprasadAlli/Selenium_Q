package sanjay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UploadTOExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1:specify the path of excel folder
		FileInputStream fs = new FileInputStream(
				"D:\\SeleniumQspiders\\Vtiger.WASM6.Framework\\src\\test\\resources\\Upload.xlsx");

		// step2:Open the excel
		Workbook wb = WorkbookFactory.create(fs);

		// step3:specify the sheetName
		Sheet sh = wb.getSheet("Sheet2");

		// step4:specify the row number
		Row r = sh.createRow(5);

		// step5:specify the cell number
		Cell c = r.createCell(5);

		// step6:write the data
		c.setCellValue("sanjay12345");

		FileOutputStream fout = new FileOutputStream(
				"D:\\SeleniumQspiders\\Vtiger.WASM6.Framework\\src\\test\\resources\\Upload.xlsx");
		System.out.println("Success");

		wb.write(fout);
		wb.close();
	}
}
