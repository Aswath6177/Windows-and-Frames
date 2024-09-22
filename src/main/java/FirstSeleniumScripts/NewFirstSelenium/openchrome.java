package FirstSeleniumScripts.NewFirstSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openchrome {
	 public static void main(String[] args) {
	        // Set up WebDriver Manager to handle ChromeDriver binaries
	      WebDriverManager.chromedriver().setup();
	      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

	        // Instantiate a ChromeDriver class
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a website (e.g., Google)
	        driver.get("https://www.google.com");

	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());

	        // Close the browser
	        
	    }
	}