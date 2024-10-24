package selenium_Basic_Program;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Child_Browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		/*WebElement NewTab = driver.findElement(By.xpath("//input[@name='NewTab']"));
		NewTab.click();*/
		WebElement NewWindow = driver.findElement(By.xpath("//input[@value='New Window']"));
		NewWindow.click();
		//Storing Windows in Collection
		Set<String> window = driver.getWindowHandles();
		//Use of Cursor
		Iterator<String> itr = window.iterator();
		String win[]=new String[5];
		System.out.println("Total Windows " + window.size());
		for(int i=0;i<window.size();i++)
		{
			win[i]=itr.next();
			System.out.println(win[i]);
		}
		driver.switchTo().window(win[0]);
		System.out.println("Title of windows 0 = " + driver.getTitle());
		driver.switchTo().window(win[1]);
		System.out.println("Title of windows 1 = " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}
}
