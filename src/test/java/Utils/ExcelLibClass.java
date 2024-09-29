package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibClass implements Autoconstrant
{
	public static String getcradencials(int row,int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(excel_Path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
		
	}
	

}
