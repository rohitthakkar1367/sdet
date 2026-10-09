//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Find search box
        WebElement searchBox =
                driver.findElement(By.name("q"));

        // Type text
        searchBox.sendKeys("Selenium WebDriver");

        // Check if visible
        System.out.println("Displayed: "
                + searchBox.isDisplayed());

        // Check if enabled
        System.out.println("Enabled: "
                + searchBox.isEnabled());

        // Get attribute
        System.out.println("Name attribute: "
                + searchBox.getAttribute("name"));

        // Clear text
        searchBox.clear();

        // Type again
        searchBox.sendKeys("Selenium Java");

        driver.quit(); 
    }
}