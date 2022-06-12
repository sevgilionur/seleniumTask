package com.cydeo.tests.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Webstaurantstore {

    //Go to https://www.webstaurantstore.com/
    //Search for "stainless work table"
    //check the search result and unsure that every item has "Table" in it's title
    //add the last found item
    //empty cart

    public Webstaurantstore(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> searchResults;

    @FindBy(css = "#paging>nav>ul >li.rc-pagination-next >a>svg")
    public WebElement clickNextButton;

    @FindBy(xpath = "//input[@data-testid='itemAddCart']")
    public List<WebElement> inStockItems;







}
