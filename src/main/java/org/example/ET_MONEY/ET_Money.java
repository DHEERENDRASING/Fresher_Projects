package org.example.ET_MONEY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ET_Money {

    public static void main(String[] args) {
       //invoking the browser
        WebDriver driver = new ChromeDriver();
        //maximizing the window screen
        driver.manage().window().maximize();
        //using implicit wait to avoid any timeout and process error
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Task 1: Launch URL
        driver.get("https://www.etmoney.com/mutual-funds/filter/long-term-funds-return");

        // Task 2: Verify if "Long-Term Historic Returns" is selected
        WebElement returnsCheckbox = driver.findElement(By.cssSelector("input[value='long_term']"));
        if (returnsCheckbox.isSelected()) {
            System.out.println("Long-Term Historic Returns is selected.");
        } else {
            System.out.println("Long-Term Historic Returns is not selected.");
        }

        // Task 3: Click on Investment Type "SIP"
        WebElement sipCheckbox = driver.findElement(By.cssSelector("input[value='sip']"));
        sipCheckbox.click();

        // Task 4: Click on "Hybrid" under Category
        WebElement categoryCheckbox = driver.findElement(By.cssSelector("input[value='HYBRID']"));
        categoryCheckbox.click();

        // Task 5: Verify if "All" is checked by default
        WebElement allCheckbox = driver.findElement(By.cssSelector("div[id='HYBRID'] input[value='0']"));
        if (allCheckbox.isSelected()) {
            System.out.println("All checkbox is checked by default.");
        } else {
            System.out.println("All checkbox is not checked by default.");
        }

        // Task 6: Click on the "Aggressive Hybrid" checkbox to select it
        WebElement aggressiveHybridCheckbox = driver.findElement(By.xpath("(//input[@value='68'])[1]"));
        aggressiveHybridCheckbox.click();

        // Task 7: Verify if "All" checkbox is unchecked automatically
        if (!allCheckbox.isSelected()) {
            System.out.println("All checkbox is unchecked automatically.");
        } else {
            System.out.println("All checkbox is not unchecked automatically.");
        }

        // Task 8: Click on 1Y to sort it based on 1-year return
        WebElement oneYearSortLink = driver.findElement(By.xpath("(//strong[@class='sorting-title'][normalize-space()='1Y'])[2]"));
        oneYearSortLink.click();

        // Task 9: Get all the returns and verify if they are sorted in descending order
        List<WebElement> returnsElements = driver.findElements(By.xpath("(//td[@class='sip-return'])[911]"));
        double[] returnsValues = new double[returnsElements.size()];
        for (int i = 0; i < returnsElements.size(); i++) {
            returnsValues[i] = Double.parseDouble(returnsElements.get(i).getText().replace("%", " "));
        }
        boolean isSorted = true;
        for (int i = 0; i < returnsValues.length - 1; i++) {
            if (returnsValues[i] < returnsValues[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Returns are sorted in descending order.");
        } else {
            System.out.println("Returns are not sorted in descending order.");
        }
        // Close the browser
        driver.quit();
    }
}
