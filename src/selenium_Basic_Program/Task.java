package selenium_Basic_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task 
{
	public static void main(String[] args) throws InterruptedException
			{
		      System.setProperty("webdriver.Chrome.driver", "E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("http://www.dhtmlgoodies.com/scripts/floating_window_with_tabs/floating_window_with_tabs.html");
	      
	      driver.findElement(By.xpath("//span[text()='Info']")).click();
	    String Text1= driver.findElement(By.xpath("(//div[@class='floatingWindowContent'])[1]")).getText();
		    
		    if(Text1.contains("from"))
		    {
		    System.out.println(Text1);
		    }
		    
		    driver.findElement(By.xpath("//span[text()='More info']")).click();
		    String Text2= driver.findElement(By.xpath("(//div[@class='floatingWindowContent'])[2]")).getText();
	    
		    if(Text2.contains("from"))
		    {
	   System.out.println(Text2);
		    }
		    
	    driver.findElement(By.xpath("//span[text()='The end']")).click();
	    String Text3=driver.findElement(By.xpath("(//div[@class='floatingWindowContent'])[1]")).getText();
		    if(Text3.contains("from"))
	    {
		    System.out.println(Text3);
		    }
	     
		    Thread.sleep(5000);
		      driver.close();
		}
}
