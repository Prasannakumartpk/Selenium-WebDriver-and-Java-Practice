package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("locator")).click();
		driver.findElement(By.id("locator")).sendKeys("Search");
		driver.findElement(By.linkText("locator")).clear();
		driver.findElement(By.partialLinkText("partial locator")).click();
		driver.findElement(By.className("locator")).click();
		driver.findElement(By.tagName("locator")).click();
		driver.findElement(By.xpath("locator")).click();
		driver.findElement(By.cssSelector("locator")).click();

	}

}
