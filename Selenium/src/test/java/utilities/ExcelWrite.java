package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {

		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFCell cell;

		try {
			FileInputStream filein = new FileInputStream("src/test/resources/writeexcel.xlsx");
			wb = new XSSFWorkbook(filein);
			sheet = wb.getSheetAt(0);
			sheet.getRow(0).createCell(3).setCellValue("popo");
			sheet.getRow(1).createCell(3).setCellValue("Pass");
			sheet.getRow(2).createCell(3).setCellValue("Pass");
			
			//now we need to save it, but in order to do so we will need to give FileOutputStream path
			FileOutputStream fileout = new FileOutputStream("src/test/resources/writeexcel.xlsx");
			wb.write(fileout); 
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
