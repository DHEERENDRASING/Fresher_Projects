package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Site {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select Dropdown = new Select(staticdropdown);

        Dropdown.selectByIndex(2);
        System.out.println(Dropdown.getFirstSelectedOption().getText());

        Dropdown.selectByIndex(3);
        System.out.println(Dropdown.getFirstSelectedOption().getText());

        driver.close();
    }
}
