package selenium_Basic_Program;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.Chrome.Driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    System.out.println("Title of Web Page = " + driver.getTitle());
		String expTitle="Rediffmail Free Unlimited Storage";
		String actTitle=driver.getTitle();
	    if(expTitle.equals(actTitle))
	    {
	    	System.out.println("Title Test Case is Pass");
	    }
	    else
	    {
	    	System.out.println("Title test Case is Fail");
	    }
	    String currentURL=driver.getCurrentUrl();
	    System.out.println("Cuirrent URL = " + currentURL);
	    //*********************Dimension**************************//
	    Thread.sleep(2000);
		Dimension d=new  Dimension(200,300);
	    driver.manage().window().setSize(d);
	    Thread.sleep(5000);
	    Point p=new Point(10,700);
	    driver.manage().window().setPosition(p);
	    Thread.sleep(5000);
		driver.close();
		
		
	}

}
