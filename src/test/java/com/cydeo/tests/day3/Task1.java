package com.cydeo.tests.day3;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task1 {

    //TC #1: NextBaseCRM, locators and getText() practice
    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/
    //3- Enter incorrect username: “incorrect”
    //4- Enter incorrect password: “incorrect”
    //5- Click to login button.
    //6- Verify error message text is as expected:
    //Expected: Incorrect login or password

    public static void main(String[] args) {

        Driver.getDriver().get("https://login1.nextbasecrm.com/");

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Login']"));
        username.sendKeys("incorrect");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        username.sendKeys("incorrect");

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//div[.='Incorrect login or password']"));

        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Driver.closeDriver();

    }
}
