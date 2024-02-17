package selenium_Basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Option_Present_In_ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement MonthListBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select sc=new Select(MonthListBox);
		List<WebElement> option = sc.getOptions();
		
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		System.out.println("*******************************");
		//for each loop
		for(WebElement value123:option)
		{
			System.out.println(value123.getText());
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
