package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By userName = By.cssSelector("#username");
		ElementUtil.getElement(driver, userName).sendKeys("kyalniz@gmail.com");
		By password = By.cssSelector("#password");
		ElementUtil.getElement(driver, password).sendKeys("123456");
		By login = By.cssSelector("#loginBtn");
		ElementUtil.clickOn(driver, login);
	}

}
