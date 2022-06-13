package com.cydeo.tests.day4;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 {

    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/abtest
    //3- Locate “CYDEO” link, verify it is displayed.
    //4- Refresh the page.
    //5- Verify it is displayed, again.

    public static void main(String[] args) {

        Driver.getDriver().get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        Driver.getDriver().navigate().refresh();

        cydeoLink = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        Driver.closeDriver();
    }
}
