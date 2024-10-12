package seleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {
	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		
		
		WebElement email = driver.findElement(By.className("form-control"));
		email.click();
		email.sendKeys("Aswath");
		Thread.sleep(2000);
		
		
		
		WebElement name =driver.findElement(By.id("email"));
		name.click();
		name.sendKeys("guvilogin@gmail.com");
		Thread.sleep(2000);
		
		
		WebElement pass =driver.findElement(By.cssSelector("input[type='password']"));
		pass.click();
		pass.sendKeys("aswath&123");
		Thread.sleep(2000);
		
		
		WebElement number =driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		number.click();
		number.sendKeys("7019096184");
		Thread.sleep(2000);
		
		
		WebElement signin =driver.findElement(By.linkText("Sign Up"));
		signin.click();
		
		
		
		

		}catch(Exception e) {
			
		}
	}

}
