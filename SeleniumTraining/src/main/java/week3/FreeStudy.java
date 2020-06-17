package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		DropDownMenu2.selectDropDownValuByText(month, "Jul");
		Thread.sleep(2000);
		DropDownMenu2.selectDropDownValuByText(day, "4");
		Thread.sleep(2000);
		DropDownMenu2.selectDropDownValuByText(year, "2020");
		Thread.sleep(2000);
		
		driver.close();

	}

}
