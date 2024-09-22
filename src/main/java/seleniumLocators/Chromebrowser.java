package seleniumLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Chromebrowser {
	public static WebDriver Driver;
	
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup(); 
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
     Driver = new ChromeDriver();
     Driver.get("https://www.demoblaze.com/");
     Driver.manage().window().maximize();
     String actualtitle =Driver.getTitle();
     System.out.println("actualtitle"+actualtitle);
     if (actualtitle.equals("STORE"))
     {
    	 System.out.println("Page landed on correct website");
     }
     else {
    	 System.out.println("Page not landed on correct website");
     }
     Driver.quit();
	}
	
}
