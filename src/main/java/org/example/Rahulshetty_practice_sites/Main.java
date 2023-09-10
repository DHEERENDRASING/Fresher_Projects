package org.example.Rahulshetty_practice_sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("inputUsername")).sendKeys("Dheerendra singh");

        driver.findElement(By.name("inputPassword")).sendKeys("password ");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.name("chkboxTwo")).click();

        driver.findElement(By.className("signInBtn")).click();

//        Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dheerendra singh");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("password");

        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8871926722");

         Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();


        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id*='User']")).sendKeys("Dheerendra singh");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')][1]")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("input[id*='chkboxOne']")).click();

        driver.findElement(By.xpath("//input[contains(@id,'chkboxTwo')][1]")).click();

         driver.findElement(By.cssSelector("button[class*='submit']")).click();

         driver.close();
    }
}