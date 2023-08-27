package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;


public class DEMO_SITE {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.myntra.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement elementToHover = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(elementToHover).perform();

        driver.findElement(By.xpath("//a[@href='/men-tshirts']")).click();

        driver.findElement(By.xpath("//div[@class='brand-more']")).click();

        driver.findElement(By.xpath("//li[253]//label[1]")).click();

        driver.findElement(By.xpath("//li[254]//label[1]"));

        driver.getCurrentUrl();

        String expectedURL = "men-tshirts?f=Brand%3AHERE%26NOW%2CHRX%20by%20Hrithik%20 Roshan";

        driver.get(expectedURL);

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL, "url not found ");

        driver.close();
    }
}
