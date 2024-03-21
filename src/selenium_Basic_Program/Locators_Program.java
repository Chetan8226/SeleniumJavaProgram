package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Program 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		//************by tag_name***************
		driver.findElement(By.tagName("input")).sendKeys("ChetanNannaware");
		//********by_ID*************
		driver.findElement(By.id("fullname")).sendKeys("ChetanNannaware");
		//**********by Class_Name*****
		driver.findElement(By.className("txtbox1")).sendKeys("ChetanNannaware");
		//**********by Name*********
		driver.findElement(By.name("fullname")).sendKeys("ChetanNannaware");
		//**********Xpath by Attribute*********
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("ChetanNannaware");
		//**********Xpath by Contains*********
		driver.findElement(By.xpath("//input[contains(@name,'fullname')]")).sendKeys("ChetanNannawre");
		//**********Xpath by Index**********
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Chandrapur");
		//**********Xpath by text**********
		//driver.findElement(By.xpath("//a[text()='Investor Information']")).click();
		//**********Xpath by LinkText*********
		//driver.findElement(By.linkText("Advertise with us")).click();
		//**********Xpath by Partial link text*********(If only half name is available it can be work)*****
		driver.findElement(By.partialLinkText("Advertise")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
