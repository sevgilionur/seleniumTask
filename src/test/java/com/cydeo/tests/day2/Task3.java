package com.cydeo.tests.day2;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task3 {

    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write “apple” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “apple” word

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        BrowserUtils.verifyURLStartsWith(driver,"apple");

    }
}
