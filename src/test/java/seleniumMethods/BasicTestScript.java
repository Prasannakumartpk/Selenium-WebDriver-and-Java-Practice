package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTestScript {

	public static void main(String[] args) {
		/*1. Launch browser
		 *2. Open URL "https://demoqa.com/"
		 *3. Validate Title
		 *4. Close the browser
		 */
		
		// 1. Launch browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		//2. Open URL "https://demoqa.com/"
		driver.get("https://demoqa.com/");
		
		//3. Validate Title
		String act_Title = driver.getTitle();
		if(act_Title.equals("DEMOQA")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//4. Close the browser
		//driver.close();
		driver.quit();
		

	}

}
