package com.cydeo.tests.day3;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task3 {

    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/
    //3- Verify “Log in” button text is as expected:
    //Expected: Log In

    public static void main(String[] args) {

        Driver.getDriver().get("https://login1.nextbasecrm.com/");

        WebElement loginButton = Driver.getDriver().findElement(By.cssSelector("input[type='submit']"));

        Assert.assertTrue(loginButton.getAttribute("value").equals("Log In"));

        Driver.closeDriver();

    }
}
