package com.cydeo.tests.day3;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task5 {

    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    //3- Enter incorrect username into login box:
    //4- Click to `Reset password` button
    //5- Verify “error” label is as expected
    //Expected: Login or E-mail not found

    public static void main(String[] args) {

        Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement loginBox = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect username");

        WebElement resetPasswordButton = Driver.getDriver().findElement(By.xpath("//button[@value='Reset password']"));
        resetPasswordButton.click();

        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//div[.='Login or E-mail not found']"));

        BrowserUtils.webElementVerification(errorMessage, "Login or E-mail not found");

        Driver.closeDriver();

    }
}
