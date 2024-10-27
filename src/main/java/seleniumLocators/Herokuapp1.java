package seleniumLocators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Herokuapp1 {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/nested_frames");
	driver.manage().window().maximize();
	WebElement topframe=driver.findElement(By.xpath("//frame[@name='frame-top']"));
	driver.switchTo().frame(topframe);
	List<WebElement> frames =driver.findElements(By.xpath("//frame"));
	System.out.println("No fo frames is :"+frames.size());
	driver.switchTo().frame(0);
	System.out.println("The text is :"+driver.findElement(By.xpath("//body")).getText());
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	System.out.println("The text is :"+driver.findElement(By.xpath("//body")).getText());
	driver.switchTo().parentFrame();
	driver.switchTo().frame(2);
	System.out.println("The text is :"+driver.findElement(By.xpath("//body")).getText());
	driver.switchTo().parentFrame();
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	System.out.println("The text is :"+driver.findElement(By.xpath("//body")).getText());
	driver.switchTo().parentFrame();
	driver.switchTo().frame(topframe);
	List<WebElement> frames1 =driver.findElements(By.xpath("//frame"));
	System.out.println("No fo frames is :"+frames1.size());
}
}
