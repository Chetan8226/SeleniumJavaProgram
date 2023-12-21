package selenium_Basic_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.Driver", "E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@19.993973,79.3014838,15z?entry=ttu");
		Thread.sleep(5000);
		driver.close();
		
	}

}
