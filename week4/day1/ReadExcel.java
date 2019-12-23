package week4.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	
	public static String[][] excelData(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		// HSSFWorkbook wb = new HSSFWorkbook("./data/createLead.xls");

		// wb.getSheet("Sheet1");

		XSSFSheet ws = wb.getSheetAt(0);

		int rowCount = ws.getLastRowNum();

		// int rowCount = ws.getPhysicalNumberOfRows();

		//System.out.println(rowCount);
		
		
		short cellCount = ws.getRow(0).getLastCellNum();
		
		
		//ws.getRow(0).getPhysicalNumberOfCells();
		
		//System.out.println(cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		  for (int i = 1; i <= rowCount; i++) {
			  
			  for (int j = 0; j < cellCount; j++) {
				  
				  data[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
				  
				  System.out.println(data[i-1][j]);
				   
				
			}
		  
		 
		  
		  }
		 

		/*
		 * XSSFRow row = ws.getRow(1);
		 * 
		 * XSSFCell cell = row.getCell(0);
		 * 
		 * String cellValue = cell.getStringCellValue();
		 */

		wb.close();
		
		return data;

	}

}
