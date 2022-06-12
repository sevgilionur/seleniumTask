package com.cydeo.tests.interviewTasks;

import com.cydeo.tests.pages.Webstaurantstore;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebstaurantstoreTask {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.webstaurantstore.com/");

        Webstaurantstore webstaurantstore = new Webstaurantstore();
        webstaurantstore.searchBar.sendKeys("stainless work table" + Keys.ENTER);

        //Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        for (WebElement searchResult : webstaurantstore.searchResults) {

            //actions.moveToElement(webstaurantstore.clickNextButton).perform();

            for (WebElement eachResult : webstaurantstore.searchResults) {

                if(eachResult.getText().toLowerCase().contains("table")){
                    System.out.print("");
                }else{
                    System.out.println(eachResult.getText());
                }
            }

            try {
                if(Driver.getDriver().findElement(By.cssSelector("#paging > nav > ul > li.rc-pagination-next.rc-pagination-disabled > button > svg"))
                        .getAttribute("aria-hidden").equals("true")){
                    break;
                }
            }catch (NoSuchElementException e){

                System.out.println(":)");
            }

            webstaurantstore.clickNextButton.click();
        }

        List<WebElement> inStockItems = webstaurantstore.inStockItems;

        inStockItems.get(inStockItems.size()-1).click();




















    }





}
