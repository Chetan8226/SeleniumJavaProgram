package selenium_Basic_Program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel_To_Rediff_SignUP_Page 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement full_Name = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement PassTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement RepassTextBox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement DayListBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthListBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement YearListBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement Location = driver.findElement(By.xpath("(//input[@class='txtbox1'])[5]"));
		WebElement School = driver.findElement(By.xpath("(//input[@class='txtbox1'])[6]"));
		WebElement College = driver.findElement(By.xpath("(//input[@class='txtbox1'])[7]"));
		
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\Test_Data\\TD.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("sheet3");
		full_Name.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());//(0 R,0 C)
		emailTextBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());//(0 R,1 C)
		PassTextBox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());//(0 R,2 C)
		RepassTextBox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());//(0 R,3 C)
		Select sc=new Select(DayListBox);
		sc.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(2000);
		Select sc1=new Select(MonthListBox);
		sc1.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
		Thread.sleep(2000);
		Select sc2=new Select(YearListBox);
		sc2.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
		Location.sendKeys(excel.getRow(0).getCell(7).getStringCellValue());//(0 R,7 C)
		School.sendKeys(excel.getRow(0).getCell(8).getStringCellValue());//(0 R,8 C)
		College.sendKeys(excel.getRow(0).getCell(9).getStringCellValue());//(0 R,9 C)
		Thread.sleep(5000);
		driver.close();
		
	}

}
