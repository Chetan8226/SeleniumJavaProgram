package selenium_Basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Option_And_First_Option_ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
		Select sc=new Select(cars);
		sc.selectByVisibleText("Volvo");
		sc.selectByVisibleText("Saab");
		List<WebElement> selectedOption = sc.getAllSelectedOptions();
		for(WebElement Option:selectedOption)         //for each loop
		{
			System.out.println(Option.getText());
		}
		/*for(int i=0;i<selectedOption.size();i++)    //for loop
		{
			System.out.println(selectedOption.get(i).getText());
		}*/
		System.out.println("***********************************************");
		WebElement firstoption = sc.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		Thread.sleep(3000);
		driver.close();
		
	}

}
