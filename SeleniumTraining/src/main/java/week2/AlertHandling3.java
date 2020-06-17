package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		// URL
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		// Locator
		By goButton = By.name("proceed");
		
		// Launch browser
		ElementUtil.launchBrowser(driver, "chrome");
		
		driver=new ChromeDriver();
		ElementUtil.launchURL(driver, url);
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clickOn(driver, goButton);
		ElementUtil.launchBrowser(driver, "chrome");
		
		Thread.sleep(4000);
		
		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Text is correct");
		} else {
			System.out.println("Text is not correct");
		}
		
		// Close the browser
		ElementUtil.quitBrowser(driver);
		
		
		
		
	}

}
