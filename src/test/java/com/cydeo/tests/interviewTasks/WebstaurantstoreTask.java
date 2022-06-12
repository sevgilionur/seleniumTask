package com.cydeo.tests.interviewTasks;

import com.cydeo.tests.pages.Webstaurantstore;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebstaurantstoreTask {

    @Test
    public void test(){

        Driver.getDriver().get("https://www.webstaurantstore.com/");

        Webstaurantstore webstaurantstore = new Webstaurantstore();
        webstaurantstore.searchBar.sendKeys("stainless work table" + Keys.ENTER);

        for (WebElement eachResult : webstaurantstore.searchResults) {
            System.out.println("eachResult.getText() = " + eachResult.getText());
            Assert.assertTrue(eachResult.getText().toLowerCase().contains("table"));
        }


    }





}
