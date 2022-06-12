package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomeWork4 {

    public static void main(String[] args) {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        //3- Click to “Home” link
        //4- Verify title is as expected:
        //Expected: Practice
        //PS: Locate “Home” link using “className” locator

        WebDriver driver = BrowserUtils.setDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/inputs");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        BrowserUtils.titleVerification(driver, "Practice");

        

    }
}
