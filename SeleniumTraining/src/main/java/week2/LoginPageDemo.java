package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageDemo {
	
	public static WebDriver driver;
	static By email = By.id("username");
	static By password = By.id("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://app.hubspot.com/login";
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(5000);
		
		ElementUtil.getElement(driver, email).sendKeys("ilhan@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("567asdf");
		ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.quitBrowser(driver);
		
		
		

		
	}

}
