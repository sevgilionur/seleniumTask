package com.cydeo.tests.day4;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task1_2 {

    //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
    //TC #1: XPATH and cssSelector Practices
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/forgot_password
    //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
    //a. “Home” link
    //b. “Forgot password” header
    //c. “E-mail” text
    //d. E-mail input box
    //e. “Retrieve password” button
    //f. “Powered by Cydeo text
    //4. Verify all web elements are displayed.
    //First solve the task with using cssSelector only. Try to create 2 different
    //cssSelector if possible
    //Then solve the task using XPATH only. Try to create 2 different
    //XPATH locator if possible

    public static void main(String[] args) {

        Driver.getDriver().get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = Driver.getDriver().findElement(By.cssSelector("a[class='nav-link']"));
        WebElement forgotPasswordHeader = Driver.getDriver().findElement(By.xpath("//div//h2"));
        WebElement emailText = Driver.getDriver().findElement(By.xpath("//label[.='E-mail']"));
        WebElement emailInputBox = Driver.getDriver().findElement(By.cssSelector("input[type='text']"));
        WebElement retrievePasswordButton = Driver.getDriver().findElement(By.xpath("//i[.='Retrieve password']"));
        WebElement poweredByCydeotext = Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"));

        Assert.assertTrue(homeLink.isDisplayed());
        Assert.assertTrue(forgotPasswordHeader.isDisplayed());
        Assert.assertTrue(emailText.isDisplayed());
        Assert.assertTrue(emailInputBox.isDisplayed());
        Assert.assertTrue(retrievePasswordButton.isDisplayed());
        Assert.assertTrue(poweredByCydeotext.isDisplayed());


    }

}
