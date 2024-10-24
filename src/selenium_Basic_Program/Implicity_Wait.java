package selenium_Basic_Program;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicity_Wait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement searchBar = driver.findElement(By.xpath("//ttextarea[@class='gLFyf']"));  //t, tt
		searchBar.sendKeys("Selenium");
		//Thread.sleep(3000);
		WebElement listBox = driver.findElement(By.xpath("//ul[@role='listbox']//li[4]"));
		listBox.click();
		//Thread.sleep(3000);
		driver.close();
	}
}