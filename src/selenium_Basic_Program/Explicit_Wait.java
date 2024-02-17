package selenium_Basic_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe"); 
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		WebElement Button1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		Button1.click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(150));
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement Button2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
		Button2.click();
		WebDriverWait p=new WebDriverWait(driver,Duration.ofSeconds(150));
		p.until(ExpectedConditions.textToBePresentInElement(Button2,"Selenium Webdriver"));
		
		WebElement Button3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		Button3.click();
		WebElement HiddenBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		WebDriverWait q=new WebDriverWait(driver,Duration.ofSeconds(150));
		q.until(ExpectedConditions.visibilityOfAllElements(HiddenBtn));
		
		
		driver.close();
		
	}

}
