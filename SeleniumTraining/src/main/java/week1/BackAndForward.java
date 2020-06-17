package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForward {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // google
		
		driver.navigate().to("https://www.amazon.com"); // amazon
		Thread.sleep(2000);
		
		driver.navigate().back(); // google
		Thread.sleep(2000);
		
		driver.navigate().forward(); // amazon
		Thread.sleep(2000);
		
		driver.navigate().back(); // google
		Thread.sleep(2000);
		
		driver.navigate().refresh(); // refresh 
		
		driver.quit();
		
		// What's the difference between get and navigate function
		// get navigates to a webpage webdriver will wait until the page has fully loaded
		// before returning control script get function does not have any method
		
		// Navigate navigates URL WebDriver will not wait the page has fully loaded
		// Navigate function has some methods like back, forward, refresh
		
	}

}
