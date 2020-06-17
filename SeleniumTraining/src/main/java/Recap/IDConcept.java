package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDConcept {
	public static void main(String[] args) throws InterruptedException {
		
		// ID is always unique for each element so it's very common way to locate elements
		// using ID locator
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		// FIRST USAGE
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("cemil@sample.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234@test");
		Thread.sleep(2000);
		WebElement signInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
		signInButton.click();
		driver.quit();
		
	}

}
