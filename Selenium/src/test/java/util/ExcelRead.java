package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel reader
public class ExcelRead {

	public static void main(String[] args) {

		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFCell cell;

		try {
			FileInputStream excelFile = new FileInputStream("src/test/resources/readexcel.xlsx");

			wb = new XSSFWorkbook(excelFile);
			sheet = wb.getSheet("Sheet1");
			cell = sheet.getRow(2).getCell(2);
			System.out.println("Cell data is: " + cell.getStringCellValue());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
