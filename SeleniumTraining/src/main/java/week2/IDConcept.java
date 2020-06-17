package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IDConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//ID locator
		//First usage
//		WebElement element = driver.findElement(By.id("username"));
//		element.sendKeys("kyalniz@gmail.com");
//		Thread.sleep(2000);
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("56kuyt");
//		Thread.sleep(2000);
//		WebElement button = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		button.click();
//		Thread.sleep(2000);
		
		//Second usage
		//driver.findElement(By.id("username")).sendKeys("kyalniz@gmail.com");
		
		
		//Third USage
//		By user = By.id("username");
//		By pass = By.id("password");
//		By login = By.id("loginBtn");
//		
//		WebElement user1 = driver.findElement(user);
//		user1.sendKeys("ilhan@hotmail.com");
//		Thread.sleep(2000);
//		WebElement pass1 = driver.findElement(pass);
//		pass1.sendKeys("12345");
//		WebElement btn = driver.findElement(login);
//		btn.click();
//		
//		driver.quit();
		
		//Fourth Usage
		By user = By.id("username");
		By pass = By.id("password");
		By login = By.id("loginBtn");
		
		//Using elementutil class
		ElementUtil.getElement(driver, user).sendKeys("asga3@hotmail.com"); 
		ElementUtil.getElement(driver, pass).sendKeys("123rf");
		//ElementUtil.getElement(driver, login).click();
		ElementUtil.clickOn(driver, login);
		
		
		
		
		
		

	}

}
