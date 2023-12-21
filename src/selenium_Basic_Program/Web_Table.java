package selenium_Basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		Thread.sleep(3000);
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		System.out.println("Size of Rows = " + row.size());
		System.out.println("Size of Column = " + column.size());
		for(int i=0;i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
			
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
