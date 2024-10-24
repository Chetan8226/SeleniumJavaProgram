package selenium_Basic_Program;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Single_data_From_ExcelFile 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\Test_Data\\TD.xlsx"); 
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value1 = excel.getRow(0).getCell(0).getStringCellValue();//(0 R,0 C) Subject
		String value2 = excel.getRow(0).getCell(1).getStringCellValue();//(0 R,1 C) Marks
		String value3 = excel.getRow(1).getCell(0).getStringCellValue();//(1 R,0 C) JAVA
		String value4 = excel.getRow(1).getCell(1).getStringCellValue();//(1 R,1 C) 87
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}