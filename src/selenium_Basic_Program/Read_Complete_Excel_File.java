package selenium_Basic_Program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Complete_Excel_File 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\Test_Data\\TD.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("sheet1");
		for(int row=0;row<=sheet1.getLastRowNum();row++)//row wise data
		{
			for(int col=0;col<sheet1.getRow(row).getLastCellNum();col++)//column wise data
			{
				String value = sheet1.getRow(row).getCell(col).getStringCellValue();
				System.out.print(value + "");
			}
			System.out.println();
		}
		
		
		
	}

}
