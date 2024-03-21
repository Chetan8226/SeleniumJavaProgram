package selenium_Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeRewardsBot {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver", "E:\\Software Testing\\Jarfile\\Eclipse Program\\Selenium_ST\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseUrl = "https://www.bing.com/?scope=web&cc=IN&FORM=ANSPH1&pc=U531";
        driver.get(baseUrl);

        for (int i = 3; i <= 33; i++) {
            performSearch(driver, "chetan" + i);
            Thread.sleep(2000);
            driver.navigate().back();
        }

        Thread.sleep(5000);
        driver.close();
    }

    private static void performSearch(WebDriver driver, String searchTerm) {
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@type='search']"));
        WebElement searchButton = driver.findElement(By.xpath("//label[@id='search_icon']"));

        searchBox.clear();
        searchBox.sendKeys(searchTerm);
        searchButton.click();
    }
}
