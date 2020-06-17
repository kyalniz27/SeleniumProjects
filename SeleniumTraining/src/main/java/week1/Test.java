package week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		//System.out.println(text);
		
		if(alert.equals("Please enter a valid user name")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.id("login1")).sendKeys("mustafa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("123345");
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		

	}
	
	

}
