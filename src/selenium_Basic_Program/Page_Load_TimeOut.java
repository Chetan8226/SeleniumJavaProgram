package selenium_Basic_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page_Load_TimeOut 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.get("https://edition.cnn.com/");
		//Thread.sleep(3000);
		driver.close();
		
	}

}
