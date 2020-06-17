package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//find elements is used to get multiple elements
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//To learn how many links are available on the webpage
		System.out.println("Total links are: " + linklist.size());
		
		
		// to print out all links
		for (int i = 0; i < linklist.size(); i++) {
			String text = linklist.get(i).getText();
			//System.out.println(text);
			
		//	if(!text.isEmpty()) { // to ignore all empty links
		//		System.out.println(text);
		//	}
			
			
			if(text.equals("Forgot Password?")) {
				linklist.get(i).click();
				break;
			}
		}
		
		
		
	}

}
