package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://udemy.com");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			
			if (text.equals("Log in")) {
				list.get(i).click();
				break;
			}
			
		}
		

		
		//driver.close();

	}

}
