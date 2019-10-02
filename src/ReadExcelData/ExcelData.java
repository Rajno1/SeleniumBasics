package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public String getExcelData(String sheetname,int rownum,int cellnum) {
			String value = null;
		try {
			//Create an object of FileInputStream class to read excel file
			FileInputStream fis = new FileInputStream("/Users/rajasekhar/Documents/Data.xlsx");
			// Create an object Workbook interface
			Workbook wb = new WorkbookFactory().create(fis);
			//Read sheet inside the workbook by its name
			Sheet sheet = wb.getSheet(sheetname);
			//Read row inside the sheet
			Row row = sheet.getRow(rownum);
			//Read cell for row
			Cell cell =row.getCell(cellnum);
			//get the value present in that cell
			value = cell.getStringCellValue();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	public int getLastRownum() {
		 
		try {
			FileInputStream fis = new FileInputStream("/Users/rajasekhar/Documents/Data.xlsx");
			Workbook wb = new WorkbookFactory().create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			 int row = sheet.getLastRowNum();
			return row;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

