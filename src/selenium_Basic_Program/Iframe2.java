package selenium_Basic_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement SignINbtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
		SignINbtn.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		String value = alt.getText();
		System.out.println("PopUp Text = " + value);
		alt.accept();
		Thread.sleep(3000);
		driver.close();
		
	}

}
