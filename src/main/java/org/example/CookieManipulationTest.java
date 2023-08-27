package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CookieManipulationTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.naukri.com/");

        // Step 2: Login using valid username and password
        driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("thakurbala227@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("sj$3bbdrkpzU7Cb");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Step 3: Now delete the cookie named "nauk_at"
        driver.manage().deleteCookieNamed("nauk_at");

        // Step 4: Refresh/reload the page
        driver.navigate().refresh();

        // Step 5: Assert the validation number 1, if the session doesn't terminate, logout
        if (driver.getCurrentUrl().contains("https://www.naukri.com/mnjuser/homepage")) {
            System.out.println("Validation 1: Session terminated upon deleting the cookie.");
        } else {
            System.out.println("Validation 1: Session did not terminate upon deleting the cookie. Logging out...");
            driver.findElement(By.cssSelector(".nI-gNb-bar1")).click();
           driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        }

        // Step 6: Now login again and delete all cookies
        driver.manage().deleteAllCookies();

        //login again

        driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("thakurbala227@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("sj$3bbdrkpzU7Cb");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Step 7: Refresh/reload the page
        driver.navigate().refresh();

        // Step 8: Assert the validation number 1, if the session doesn't terminate, logout
        if (driver.getCurrentUrl().contains("https://www.naukri.com/")) {
            System.out.println("Validation 1: Session terminated upon deleting all cookies.");
        } else {
            System.out.println("Validation 1: Session did not terminate upon deleting all cookies. Logging out...");
            driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        }
        // Step 9: Now login again and edit the value of "nauk_at"
        driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("thakurbala227@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("sj$3bbdrkpzU7Cb");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Quit the driver and close the browser
        driver.quit();
    }
}