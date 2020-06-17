package week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/Drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		
		if (ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		} else {
			System.out.println("Incorrect text");
		}
		
		driver.quit();
		//getAlertText();
		

	}
	
//	public static String getAlertText() {
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		return text;
//	}

}
