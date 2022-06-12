package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task4 {

    public static void main(String[] args) throws InterruptedException {

        //TC #4: Library verifications
        //1. Open Chrome browser
        //2. Go to http://library2.cybertekschool.com/login.html
        //3. Enter username: “incorrect@email.com”
        //4. Enter password: “incorrect password”
        //5. Verify: visually “Sorry, Wrong Email or Password” displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://library2.cybertekschool.com/login.html");

        WebElement username = driver.findElement(By.className("form-control"));
        username.sendKeys("incorrect@email.com");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        Thread.sleep(2000);

        driver.close();

    }
}
