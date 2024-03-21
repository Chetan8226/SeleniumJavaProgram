package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Program 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://megrecruitment.nic.in/rpa/register.htm");
		WebElement emailidTxtBox = driver.findElement(By.xpath("//input[@id='emailid']"));
		System.out.println("Is Display = " + emailidTxtBox.isDisplayed());
		System.out.println("Is Enable = " + emailidTxtBox.isEnabled());
		System.out.println("Is Selected = " + emailidTxtBox.isSelected());
		System.out.println("******************************************");
		WebElement HusbandNameTxtBox = driver.findElement(By.xpath("//input[@id='husbandsname']"));
		System.out.println("Is Display = " + HusbandNameTxtBox.isDisplayed());
		System.out.println("Is Enable = " + HusbandNameTxtBox.isEnabled());
		System.out.println("Is Selected = " + HusbandNameTxtBox.isSelected());
		System.out.println("******************************************");
		WebElement CheckBox = driver.findElement(By.xpath("(//input[@name='languages'])[1]"));
		System.out.println("IS Displayed = " + CheckBox.isDisplayed());
		System.out.println("Is Enable = " + CheckBox.isEnabled());
		System.out.println("Is Selected = " + CheckBox.isSelected());
		Thread.sleep(2000);
		driver.close();
	
	}

}
