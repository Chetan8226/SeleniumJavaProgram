package selenium_Basic_Program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots_Program 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\ScreenShots\\Photo.jpeg");
		FileHandler.copy(source, dest);
		//Thread.sleep(3000);
		driver.close();
		
	}

}
