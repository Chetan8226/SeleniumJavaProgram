package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_Single_or_Multiple 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement Cars = driver.findElement(By.xpath("//select[@name='cars']"));
		Select sc=new Select(Cars);
		System.out.println(sc.isMultiple());
		Thread.sleep(3000);
		sc.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		sc.selectByVisibleText("Saab");
		Thread.sleep(2000);
		sc.selectByVisibleText("Opel");
		Thread.sleep(2000);
		sc.selectByVisibleText("Audi");
		Thread.sleep(2000);
		driver.close();
	}

}
