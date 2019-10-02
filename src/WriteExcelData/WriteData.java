package WriteExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public  void data(int rownumber,int cellnumber,String value) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/rajasekhar/Documents/Data.xlsx"); 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(rownumber).createCell(cellnumber).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("/Users/rajasekhar/Documents/Data.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("End of writing data in excel");
		
	}

}
