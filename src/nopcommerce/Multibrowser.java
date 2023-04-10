package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class Multibrowser {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/login";


    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());

        // find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("shyampatel@gmail.com");
        //find the password field element
        driver.findElement(By.name("Password")).sendKeys("Ram1234");
        // close the browser
         driver.close();
    }
}




