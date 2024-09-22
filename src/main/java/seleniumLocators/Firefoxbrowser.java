package seleniumLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxbrowser {
	public static WebDriver Driver;
	public static void main(String[] args) {
		 WebDriverManager.firefoxdriver().setup();
		 
		 
		 Driver  = new FirefoxDriver();
		 Driver.get("http://google.com");
		 Driver.manage().window().maximize();
		String Currenturl=  Driver.getCurrentUrl();
		System.out.println(Currenturl);
		Driver.navigate().refresh();
		Driver.quit();
		 
	}

}
