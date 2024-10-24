package selenium_Basic_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.chromedriver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(frame1);
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(0);
		WebElement Button1 = driver.findElement(By.xpath("//button[@type='button']"));
		Button1.click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		WebElement TryHome = driver.findElement(By.xpath("//a[@id='tryhome']"));
		TryHome.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
