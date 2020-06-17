package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.security.action.GetBooleanAction;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
	}

}
