package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class HomeWork1 {

    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        //3. Search for “wooden spoon”
        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com");

        WebElement inputBox = driver.findElement(By.name("search_query"));
        inputBox.sendKeys("wooden spoon" + Keys.ENTER);

        BrowserUtils.titleVerification(driver, "Wooden spoon | Etsy");

        driver.close();


    }
}
