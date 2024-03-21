package selenium_Basic_Program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement openPopUp = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		openPopUp.click();
		//storing the windows in collection
		Set<String> windows = driver.getWindowHandles();
		//Use of Cursor
		Iterator<String> itr = windows.iterator();
		String win[]=new String[10];
		System.out.println("Total Window = " + windows.size());
		for(int i=0;i<windows.size();i++)
		{
			win[i]=itr.next();
			System.out.println(win[i]);
		}
		driver.switchTo().window(win[0]);
		System.out.println("Title of Window 0 = " + driver.getTitle());
        driver.switchTo().window(win[1]);
        System.out.println("Title of window 1 = " + driver.getTitle());
        WebElement FN = driver.findElement(By.xpath("//td[contains(text(),'Fir')]"));
        WebElement LN = driver.findElement(By.xpath("//td[contains(text(),'Las')]"));
		System.out.println("Child Browser First Name Text = " + FN.getText());
		System.out.println("Child Browser Last Name Text = " + LN.getText());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
