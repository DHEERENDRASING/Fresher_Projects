package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RahulShetty_Assignment {
    public static void main(String[] args){

        //Invoking the browser for chrome we're using chrome driver
        WebDriver driver = new ChromeDriver();

        //maximizing the window
        driver.manage().window().maximize();

        //Putting the valid link to open in chrome browser
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //placing username using name locator
        driver.findElement(By.name("name")).sendKeys("Dheerendra singh");
        //filling email id using name locator
        driver.findElement(By.name("email")).sendKeys("thakurbala227@gmail.com");
        //making password using the id locator
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("dheerendra");
        //clicking on check box .
        driver.findElement(By.id("exampleCheck1")).click();
        //selecting gender using id locator
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        //confirming male in id locator using css selector
        driver.findElement(By.cssSelector("body app-root option:nth-child(1)")).click();
        //selecting the student option as occupation
        driver.findElement(By.id("inlineRadio1")).click();
        //putting the birthdate
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("10-05-1999");
        //clicking the submit button
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //getting the final text from heading
        System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

        driver.close();
    }
}
