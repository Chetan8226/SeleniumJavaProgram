package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sanity_On_Rediffmail_Program 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement fnameTextBox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement fnameText = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		int count=0;
		if(fnameTextBox.isDisplayed())
		{
			count++;
			System.out.println("Rediff Mail Frame is Available");
		}
		else
		{
			System.out.println("Rediff Mail Frame is Not Available");
		}
		if(fnameText.isDisplayed())
		{
			count++;
			System.out.println("Frame Text is Available");
		}
		else
		{
			System.out.println("Frame Text Is Not Available");
		}
		System.out.println("Total Element Present on Webpage = " + count);
		Thread.sleep(3000);
		driver.close();
		
	}

}
