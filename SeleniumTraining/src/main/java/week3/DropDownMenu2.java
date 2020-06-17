package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectDropDownValuByText(day, "11");
		selectDropDownValuByText(month, "May");
		selectDropDownValuByText(year, "2015");
		
		

	}
	
	// Generic Method
	public static void selectDropDownValuByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
