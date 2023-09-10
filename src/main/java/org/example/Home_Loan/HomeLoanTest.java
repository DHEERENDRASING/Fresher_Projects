package org.example.Home_Loan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeLoanTest {
    public static void main(String[] args) {
        // Task 1: Launch URL - https://www.switchme.in/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.switchme.in/");

        // Task 2: Click on "Get a Home Loan" button.
        WebElement getLoanButton = driver.findElement(By.xpath("//button[contains(text(), 'Get a Home Loan')]"));
        getLoanButton.click();

        // Task 3: Enter Loan Amount as 50,00,000
        WebElement loanAmountInput = driver.findElement(By.id("loanamount"));
        loanAmountInput.clear();
        loanAmountInput.sendKeys("50,00,000");

        // Task 4: Click on "Show Me My Options"
        WebElement showOptionsButton = driver.findElement(By.xpath("//button[contains(text(), 'Show Me My Options')]"));
        showOptionsButton.click();

        // Task 5: Verify if the first line item is expanded by default.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstLineItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='home-loan-result']/div[1]")));
        boolean isExpanded = firstLineItem.getAttribute("class").endsWith("active");

        // Task 6: Click on the first item to collapse it.
        WebElement firstItemHeader = driver.findElement(By.xpath("//div[@class='home-loan-result']/div[1]//h3"));
        firstItemHeader.click();

        // Task 7: Get the scheme name which is offering the minimum and maximum Interest Rate.
        WebElement[] schemeElements = driver.findElements(By.xpath("//div[@class='home-loan-result']//h3"))
                .toArray(new WebElement[0]);
        double minRate = Double.POSITIVE_INFINITY;
        double maxRate = Double.NEGATIVE_INFINITY;
        String minRateScheme = null;
        String maxRateScheme = null;

        for (WebElement schemeElement : schemeElements) {
            String schemeName = schemeElement.getText();
            WebElement interestRateElement = schemeElement.findElement(By.xpath("../../div[2]//span[@class='interest-rate']"));
            double interestRate = Double.parseDouble(interestRateElement.getText().replaceAll("%", ""));

            if (interestRate < minRate) {
                minRate = interestRate;
                minRateScheme = schemeName;
            }

            if (interestRate > maxRate) {
                maxRate = interestRate;
                maxRateScheme = schemeName;
            }
        }

        System.out.println("Minimum Interest Rate Scheme: " + minRateScheme);
        System.out.println("Maximum Interest Rate Scheme: " + maxRateScheme);

        driver.quit();
    }
}
