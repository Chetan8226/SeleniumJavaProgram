package selenium_Basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Multiple_Elements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links on Google Page = " + links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++)
		{
			String expLinks="Images";
			String actLinks=links.get(i).getText();
			if(expLinks.equals(actLinks))
			{
				links.get(i).click();
				break;
			}
		}
		System.out.println("Title = " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
	}

}
