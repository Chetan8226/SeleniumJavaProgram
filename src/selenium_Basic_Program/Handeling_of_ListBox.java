package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handeling_of_ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement DayListBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select sc=new Select(DayListBox);
		Thread.sleep(3000);
		//sc.selectByIndex(10);
		//sc.selectByValue("10");
		sc.selectByVisibleText("10");
		Thread.sleep(5000);
		driver.close();
		
	}

}
