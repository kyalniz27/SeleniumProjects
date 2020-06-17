package week2;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		// First Usage
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("mustafa@yahoo.com");
//		Thread.sleep(2000);
//		WebElement userPass = driver.findElement(By.name("password"));
//		userPass.sendKeys("12345");
//		Thread.sleep(2000);
//		WebElement click = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
//		click.click();
//		Thread.sleep(2000);
		
		// Second usage
//		driver.findElement(By.name("username")).sendKeys("koklu@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys("12345");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//		Thread.sleep(3000);
//		driver.quit();
		
		// Third Usage
//		By username = By.name("username");
//		By password = By.name("password");
//		WebElement user = driver.findElement(username);
//		user.sendKeys("kyalniz@gmail.com");
//		WebElement pass = driver.findElement(password);
//		pass.sendKeys("67od0");
		
		// Fourth and preferred usage as developer
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
		ElementUtil.getElement(driver, username).sendKeys("kyalniz27@hotmail.com");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, password).sendKeys("abc123");
		Thread.sleep(2000);
		ElementUtil.clickOn(driver, login);
		Thread.sleep(2000);
		ElementUtil.quitBrowser(driver);
		
		
		
		
		
		
		
		
	}

}
