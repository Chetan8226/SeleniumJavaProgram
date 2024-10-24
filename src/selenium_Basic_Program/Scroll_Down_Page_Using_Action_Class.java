package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Down_Page_Using_Action_Class 
  {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.Chrome.driver", "E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/test-scenario-examples");
		Actions action= new Actions(driver);   //Action Class
		WebElement Conclusion = driver.findElement(By.xpath("//h3[@class=\"wp-block-heading\"]"));
		WebElement LeaveAComments = driver.findElement(By.xpath("//h3[@id=\"reply-title\"]"));
		action.moveToElement(Conclusion).perform();  //Taking Action on Element
		String Conclusion_Text = Conclusion.getText();
		System.out.println("Text of Conclusion = " + Conclusion_Text);
		Thread.sleep(3000);
		action.moveToElement(LeaveAComments).perform();
		String LeaveACommentsText = LeaveAComments.getText();
		System.out.println("Text of Leave A Comment = " + LeaveACommentsText);
		System.out.println("Text of Conclusion & Comment = " + "1)" + Conclusion_Text + " " + "2)" + LeaveACommentsText);
		Thread.sleep(3000);
		driver.quit();
	}
  }
