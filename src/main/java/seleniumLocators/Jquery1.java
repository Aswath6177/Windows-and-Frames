package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery1 {
	public static void main (String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
	while(true) {	
		
		WebElement month = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]"));
		
		
		WebElement year = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]"));
		
		if( month.getText().equalsIgnoreCase("November") && year.getText().equalsIgnoreCase("2024")  ) {
			break;
		}
			
		WebElement prev = driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]"));
			prev.click();
			Thread.sleep(1000);
		}
	WebElement date = driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='22']"));
	date.click();
	System.out.println("The selected date is : 22");
	driver.quit();
	}
	
	
}
//!month.getText().equalsIgnoreCase("July") &&








