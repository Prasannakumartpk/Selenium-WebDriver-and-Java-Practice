package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		// Set the ChromeDriver property
        //System.setProperty("webdriver.chrome.driver", "/users/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
        

        // Close browser
        //driver.quit();


	}

}
