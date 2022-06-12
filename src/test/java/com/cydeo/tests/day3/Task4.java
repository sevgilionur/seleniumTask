package com.cydeo.tests.day3;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task4 {

    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    //3- Verify “Reset password” button text is as expected:
    //Expected: Reset password

    public static void main(String[] args) {

        Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = Driver.getDriver().findElement(By.xpath("//button[.='Reset password']"));

        BrowserUtils.webElementVerification(resetPasswordButton, "Reset password");

        Driver.closeDriver();

    }
}
