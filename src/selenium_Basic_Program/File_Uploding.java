package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploding 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='upfile']"));
		WebElement pressButton = driver.findElement(By.xpath("//input[@value='Press']"));
		chooseFile.sendKeys("E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\Test_Data\\TD.xlsx");
        Thread.sleep(3000);
		pressButton.click();
        driver.close();
	
	}

}
