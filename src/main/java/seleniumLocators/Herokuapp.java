package seleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {
public static void main (String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	WebElement clickhere= driver.findElement(By.xpath("//a[@target='_blank' and text()='Click Here']"));
	clickhere.click();
	String mainwindow = driver.getWindowHandle();
	Set<String> allwindows = driver.getWindowHandles();
	 for ( String window : allwindows) {
		 if(!window.equals(allwindows)) {
			 driver.switchTo().window(window);
		 }
	 }
		 System.out.println("The h3 Tag in new window is  : "+ driver.findElement(By.xpath("//h3")).getText());
		 driver.close();
		 driver.switchTo().window(mainwindow);
		 System.out.println("After closing the new window  : "+ driver.findElement(By.xpath("//h3")).getText());
		 driver.quit();

	 

}
}
