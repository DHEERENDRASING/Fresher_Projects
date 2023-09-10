package org.example.MYTHERESA_Stre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_Site_Relevel {
    public static void main(String[] args) throws InterruptedException {

        String pass = "12345678";

        String pass1 = "123456789";

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mytheresa.com/int/en/account/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.className("dropdown__select__content")).click();

        driver.findElement(By.id("mr-0")).click();

        driver.findElement(By.cssSelector("input[placeholder=' '][name='firstName']")).sendKeys("dheerendra");

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("singh");

        driver.findElement(By.xpath("(//input[contains(@placeholder,'')])[7]")).sendKeys("dheerendr6458f973@gmail.com");

        driver.findElement(By.xpath("//div[@class='signupform__content']//div[@class='form__element form__element--password']//input[contains(@placeholder,'')]")).sendKeys(pass);

        driver.findElement(By.xpath("//input[@name='passwordConfirmation']")).sendKeys(pass);

        Thread.sleep(5000);

        driver.findElement(By.xpath("(//div[@class='button'])[2]")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//a[@class='button button--alternative']")).click();

        driver.findElement(By.cssSelector("div[class='changepassword__button'] div[class='button']")).click();

        driver.findElement(By.xpath("//input[@name='currentPassword']")).sendKeys(pass);

        driver.findElement(By.cssSelector("input[placeholder=' '][name='newPassword']")).sendKeys(pass1);

        driver.findElement(By.cssSelector("input[placeholder=' '][name='confirmNewPassword']")).sendKeys(pass1);

        driver.findElement(By.cssSelector("div[class='modal__wrapper__footer__buttons'] div[class='button']")).click();

        Thread.sleep(20000);


        driver.findElement(By.xpath("//a[@id='-5']")).click();

        driver.close();


    }
}
