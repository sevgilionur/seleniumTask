package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomeWork3 {

    public static void main(String[] args) {

        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //  Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //  Expected: Google

        WebDriver driver = BrowserUtils.setDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        BrowserUtils.titleContains(driver, "Gmail");

        driver.navigate().back();

        BrowserUtils.titleVerification(driver, "Google");


        driver.close();



    }
}
