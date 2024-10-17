package seleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {
	
	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable")); 
		Actions Builder = new Actions(driver);
		Builder.dragAndDrop(source, target).perform();
		
		WebElement Dropped = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		
	System.out.println("Text element after drop : "+Dropped.getText());
		
		}catch(Exception e) {
	}
	}
}
