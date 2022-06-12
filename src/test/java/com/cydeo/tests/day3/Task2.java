package com.cydeo.tests.day3;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task2 {

    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/
    //3- Verify “remember me” label text is as expected:
    //Expected: Remember me on this computer
    //4- Verify “forgot password” link text is as expected:
    //Expected: Forgot your password?
    //5- Verify “forgot password” href attribute’s value contains expected:
    //Expected: forgot_password=yes

    public static void main(String[] args) {

        Driver.getDriver().get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = Driver.getDriver().findElement(By.xpath("//label[.='Remember me on this computer']"));

        BrowserUtils.webElementVerification(rememberMeLabel, "Remember me on this computer" );

        WebElement forgotPasswordLink = Driver.getDriver().findElement(By.xpath("//a[.='Forgot your password?']"));

        BrowserUtils.webElementVerification(forgotPasswordLink, "FORGOT YOUR PASSWORD?");

        Assert.assertTrue(forgotPasswordLink.getAttribute("href").contains("forgot_password=yes"));

        Driver.closeDriver();


    }
}
