package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class WriteOnExcelFile {
	@Test
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\96655\\Desktop\\سطح المكتب\\java project\\project 2\\excelFiles\\Excelfile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		try (Workbook wb = new XSSFWorkbook(fs)) {
			Sheet sheet1 = wb.getSheetAt(0);
			int lastRow = sheet1.getLastRowNum();
			for(int i=0; i<=lastRow; i++){
				Row row = sheet1.getRow(i);
				Cell cell = row.createCell(1);

				cell.setCellValue("PROJECT 2 - SIMPLE LEARN");

			}
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
			System.out.println("Write into Excel DONE !!");
			fos.close();
		}
	}

}