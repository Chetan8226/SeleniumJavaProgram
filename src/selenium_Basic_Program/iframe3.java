package selenium_Basic_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		Thread.sleep(3000);
		WebElement searchBar1 = driver.findElement(By.xpath("//input[@name='s']"));
		searchBar1.sendKeys("Chetan Nannaware");
		Thread.sleep(3000);
		driver.switchTo().frame("globalSqa");
		WebElement searchBar2 = driver.findElement(By.xpath("//input[@name='s']"));
		searchBar2.sendKeys("Chetan");
		Thread.sleep(3000);
		searchBar2.clear();
		searchBar2.sendKeys("Nannaware");
		driver.switchTo().parentFrame();
		searchBar1.clear();
		searchBar1.sendKeys("Virat");
		Thread.sleep(3000);
		driver.close();
	}
}
