package selenium_Basic_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.Edge.driver","E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//********************Alert Button 1*****************
		/*WebElement alertbutton1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertbutton1.click();
		Alert alt = driver.switchTo().alert();
	    Thread.sleep(3000);
	    String value = alt.getText();
	    System.out.println("PopUp Text = " + value);
	    alt.accept();
	    Thread.sleep(3000);
	    //********************Alert Button 2*****************
	    WebElement alertwithokcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    WebElement altbutton2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    alertwithokcancel.click();
	    Thread.sleep(3000);
	    altbutton2.click();
	    Thread.sleep(3000);
	    Alert alt1 = driver.switchTo().alert();
	    String value1 = alt1.getText();
	    System.out.println("PopUp Text = " + value1);
	    alt1.accept();
	    //alt1.dismiss();*/
	    //**********************Alert Button 3****************
	    WebElement alertwithtextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	    WebElement alertbutton3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    alertwithtextbox.click();
	    Thread.sleep(3000);
	    alertbutton3.click();
	    Thread.sleep(3000);
	    Alert alt2 = driver.switchTo().alert();
	    String value2 = alt2.getText();
	    System.out.println("PopUp Text = " + value2);
	    alt2.sendKeys("Chetan Nannaware");
	    Thread.sleep(3000);
	    alt2.accept();
	    Thread.sleep(3000);
	    WebElement Result = driver.findElement(By.xpath("//p[@id='demo1']"));
	    System.out.println("Result = " + Result.getText());
	    Thread.sleep(3000);
	    driver.close();
	}

}
