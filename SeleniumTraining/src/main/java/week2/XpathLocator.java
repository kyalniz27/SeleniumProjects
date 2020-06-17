package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {

		// //tagName[@attributeName='']
		// For instance //input[@id='user name']
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("merhaba@hotmail.com");
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("12345");
		
		By userName = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		ElementUtil.getElement(driver, userName).sendKeys("mustafa@hotmail.com");
		ElementUtil.getElement(driver, password).sendKeys("23rf3");
		
		
		
		
		
		
	}

}
