package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task5 {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/registration_form
        //3- Verify header text is as expected:
        //  Expected: Registration form
        //4- Locate “First name” input box
        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Registration form";

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Test PASSED!");
        }else {
            System.out.println("Test FAILED!!!");
        }

        WebElement firstName = driver.findElement(By.name("firstname"));

        String actualPlaceHolder = firstName.getAttribute("placeholder");
        String expectedPlaceHolder = "first name";

        if (expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("Test PASSED!");
        }else {
            System.out.println("Test FAILED!!!");
        }

        driver.close();










    }


}
