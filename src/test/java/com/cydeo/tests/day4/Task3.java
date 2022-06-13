package com.cydeo.tests.day4;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task3 {

    //1. Open Chrome browser
    //2. Go to http://practice.cydeo.com/multiple_buttons
    //3. Click on Button 1
    //4. Verify text displayed is as expected:
    //Expected: “Clicked on button one!”
    //
    //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    public static void main(String[] args) {

        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");

        WebElement button1 = Driver.getDriver().findElement(By.xpath("//div/div/div/div//button[1]"));
        button1.click();

        WebElement message = Driver.getDriver().findElement(By.xpath("//p[.='Clicked on button one!']"));

        BrowserUtils.webElementVerification(message, "Clicked on button one!");

        Driver.closeDriver();

    }
}
