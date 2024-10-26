package seleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvilogin {
    public static void main (String[] agrs) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.guvi.in/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
    	WebElement name = driver.findElement(By.id("name"));
    	name.click();
    	name.sendKeys("Aswath");
    	WebElement email = driver.findElement(By.id("email"));
    	email.click();
    	email.sendKeys("aswathmendis@gmail.com");
    	WebElement password = driver.findElement(By.id("password"));
    	password.click();
    	password.sendKeys("guvilogin@1234");
    	WebElement number = driver.findElement(By.id("mobileNumber"));
    	number.click();
    	number.sendKeys("7010896181");
    	driver.findElement(By.id("signup-btn")).click();
    	Thread.sleep(4000);
    	WebElement h1tag = driver.findElement(By.xpath("//h1"));
    	System.out.println(h1tag.getText());
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.findElement(By.id("login-btn")).click();
    	WebElement emaillogin = driver.findElement(By.id("email"));
    	emaillogin.click();
    	emaillogin.sendKeys("aswathmendis@gmail.com");
    	WebElement passwordlogin = driver.findElement(By.id("password"));
    	passwordlogin.click();
    	passwordlogin.sendKeys("guvilogin@1234");
    	driver.findElement(By.id("login-btn")).click();
    	Thread.sleep(2000);
    	System.out.println(driver.getTitle());
    	Thread.sleep(2000);
    	driver.quit();

    	
    	
    }
}

