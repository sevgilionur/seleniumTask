package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com
        //3- Click to A/B Testing from top of the list.
        //4- Verify title is:
        //  Expected: No A/B Test
        //5- Go back to home page by using the .back();
        //6- Verify title equals:
        //  Expected: Practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        Thread.sleep(2000);

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

        abTestLink.click();

        Thread.sleep(2000);

        BrowserUtils.titleVerification(driver, "No A/B Test");

        driver.navigate().back();

        BrowserUtils.titleVerification(driver,"Practice");

        driver.close();

    }
}
