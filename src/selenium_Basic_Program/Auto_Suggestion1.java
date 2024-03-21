package selenium_Basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement SearchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		SearchBar.sendKeys("mama");
		Thread.sleep(2000);
		List<WebElement> ListBox = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<ListBox.size();i++)
		{
			System.out.println(ListBox.get(i).getText());
		}
		for(int i=0;i<ListBox.size();i++)
		{
			String Expected="mamaearth sunscreen";
			String Actual=ListBox.get(i).getText();
		    if(Expected.equals(Actual))
		    {
		    	ListBox.get(i).click();
		    	break;	
		    }
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
