package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class WebDriverBasicWithChrome {

	public static void main(String[] args) {

		// Set property
		System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver");

		// Set browser
		WebDriver driver = new ChromeDriver();

		// Launch browser
		driver.get("https://www.youtube.com/");

		// Get title
		String title = driver.getTitle();
		System.out.println(title);

		// Verify if the title works
		if (title.equals("YouTube")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");

		}
		
		// Get URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// Verify if the url works
		if (url.equals("https://www.youtube.com/")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");

		}
		
		// close function closes current browser
		driver.close();
		
		// quit function closes all browsers
		driver.quit();
		
		
		
	}

}
