package selenium_Basic_Program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=6987838494455164079&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9179700&hvtargid=kwd-10573980&hydadcr=14453_2367553&gclid=CjwKCAiA9dGqBhAqEiwAmRpTCzZN4v56pqRkQvoti9oRqLvwLheGlPZXHQgEiSVruQqTLBmQ0qLX2BoCiIYQAvD_BwE");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}
}