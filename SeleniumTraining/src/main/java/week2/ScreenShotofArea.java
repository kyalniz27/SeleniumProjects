package week2;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotofArea {
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://learnsdet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		element = driver.findElement(By.xpath("//img[@class='custom-logo']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", element);
		
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		org.openqa.selenium.Point p = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		
		Rectangle rectangle = new Rectangle(width + 600, height + 600);
		
		BufferedImage image = null;
		image = ImageIO.read(screen);
		
		BufferedImage dest = image.getSubimage(p.getX(), p.getY(), rectangle.width, rectangle.height);
		
		ImageIO.write(dest, "png", screen);
		
		FileUtils.copyFile(screen, new File ("/Users/newuser/Desktop/pictures/pic1.png"));
		
		driver.quit();
		
		
		
		
		
	}

}
