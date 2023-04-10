package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login";
        // launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the url into browser
        driver.get(baseUrl);
        //maximise the browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get the current Url
        driver.getCurrentUrl();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // get page source
        System.out.println("page source : " + driver.getPageSource());

       // find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("shyampatel@gmail.com");
         //find the password field element
       driver.findElement(By.name("Password")).sendKeys("Ram1234");
       // close the browser
        driver.close();
    }
}
