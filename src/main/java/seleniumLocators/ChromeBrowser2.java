package seleniumLocators;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowser2 {
    public static WebDriver Drivers;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); 
        Drivers = new ChromeDriver();
        
        Drivers.get("https://www.wikipedia.org/");
        Drivers.manage().window().maximize();
        
        WebElement searchBox = Drivers.findElement(By.id("searchInput"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.submit();
        
        WebDriverWait wait = new WebDriverWait(Drivers, Duration.ofSeconds(10));
        WebElement historySection = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("History")));
        historySection.click();

        // Print the title of the section
        String sectionTitle = Drivers.getTitle();
        System.out.println("Section Title: " + sectionTitle);
        
        Drivers.quit(); // Quit at the end
    }
}
