package seleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement createaccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createaccount.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.click();
		firstname.sendKeys("aswath");
		WebElement sureName = driver.findElement(By.xpath("//input[@name='lastname']"));
		sureName.click();
		sureName.sendKeys("mendis");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.click();
		email.sendKeys("aswathmendis@gmail.com");
		WebElement sex = driver.findElement(By.xpath("//label[@class='_58mt']/input[@value='2']"));
		sex.click();
		WebElement Password  = driver.findElement(By.xpath("//input[@type='password']"));
		Password.click();
		Password.sendKeys("Aswath$989");
		
		WebElement Day  = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Day.click();
		
		WebElement Dayclick  = driver.findElement(By.xpath("//select[@aria-label='Day']/option[@value='11']"));
		Dayclick.click();
		
		WebElement month  = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		month.click();
		
		WebElement monthclick   = driver.findElement(By.xpath("//select[@aria-label='Month']/option[@value='5']"));
		monthclick.click();
		
		
		WebElement year  = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		year.click();
		
		
		
		WebElement yearclick  = driver.findElement(By.xpath("//select[@aria-label='Year']/option[@value='1985']"));
		yearclick.click();
		
		WebElement signup  = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		signup.click();
		Thread.sleep(5000);
		
		String message=driver.findElement(By.xpath("//h3")).getText();
	
		System.out.println("the message got is : "+message);
		driver.navigate().back();
		 
		
		
		
		
		
		}catch(Exception e) {
			
		}
	}
}
