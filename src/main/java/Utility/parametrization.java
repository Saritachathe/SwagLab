package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	
	public static String getExcelData(int row,int cell,String sheetName) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SwagLab\\src\\main\\resources\\TestDataSwagLab.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}	

}
