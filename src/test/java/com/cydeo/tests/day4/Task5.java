package com.cydeo.tests.day4;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task5 {

    //1. Go to http://practice.cydeo.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.

    public static void main(String[] args) {

        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = Driver.getDriver().findElement(By.xpath("//input[@type][1]"));
        WebElement checkbox2 = Driver.getDriver().findElement(By.xpath("//input[@type][2]"));

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        Driver.closeDriver();



    }
}
