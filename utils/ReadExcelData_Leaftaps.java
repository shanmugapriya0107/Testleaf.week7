package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData_Leaftaps {

		public static String[][] readExcelDataLeaftaps(String fileName) throws IOException {
			XSSFWorkbook wb = new XSSFWorkbook("./Data_Leaftaps/" + fileName + ".xlsx");
			XSSFSheet ws = wb.getSheet("sheet1");
			
			int lastRowNum = ws.getLastRowNum();
			int lastCellNum = ws.getRow(0).getLastCellNum();
			String[][] str = new String[lastRowNum][lastCellNum];
			
			for (int i = 1; i <= lastRowNum; i++) {
				for (int j = 0; j < lastCellNum; j++) {
					String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
					str[i-1][j] = stringCellValue;
					
				}
				
			}
			
			wb.close();
			return str;
				
			}
	
		}


