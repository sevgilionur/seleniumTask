package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        //3. Verify URL contains
        //Expected: cydeo
        //4. Verify title:
        // Expected: Practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        BrowserUtils.containsURLWord(driver, "cydeo");

        BrowserUtils.titleVerification(driver, "Practice");

        driver.close();

    }
}
