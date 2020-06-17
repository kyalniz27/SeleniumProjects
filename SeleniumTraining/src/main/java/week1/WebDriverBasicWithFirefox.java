package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasicWithFirefox {
	public static void main(String[] args) {
		
		// set property
		System.setProperty("webdriver.gecko.driver", "/Users/newuser/Documents/Drivers/geckodriver");
		
		// set browser
		WebDriver obj = new FirefoxDriver();
		
		// launch browser
		obj.get("https://www.wikipedia.org/");
		
		// get title
		String title = obj.getTitle();
		System.out.println(title);
		
		// check if the title is correct
		if (title.equals("Wikipedia")) {
			System.out.println("Correct");
		} else {
			System.out.println("False");
		}
		
		// get url
		String url = obj.getCurrentUrl();
		System.out.println(url);
		
		//
		if (url.equals("https://www.wikipedia.org/\n" + 
			"")) {
			System.out.println("Correct");
		} else {
			System.out.println("False");
		}

		
		
		obj.quit();
		//obj.close();
		
	}

}
