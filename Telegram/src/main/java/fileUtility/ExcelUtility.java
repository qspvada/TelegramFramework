package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String getCellData(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
	
//		Workbook book=WorkbookFactory.create(fis);
//		
//		Sheet sheet=book.getSheet("resgister");
//		
//		Row row=sheet.getRow(5);
//		
//		Cell cell=row.getCell(0);
//		
//		String value=cell.getStringCellValue();
//		System.out.println(value);
		
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(row).getCell(cell).toString();
	}
	
	
	public static String[][] readExcelData(String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet=book.getSheet(sheetName);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowCount-1][cellCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<rowCount-1;i++) {
			for(int j=0;j<cellCount;j++) {
				System.out.print(data[i][j]+", ");
			}
			System.out.println();
		}
		
		return data;
		
	}
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcelData("register");
	}
}
