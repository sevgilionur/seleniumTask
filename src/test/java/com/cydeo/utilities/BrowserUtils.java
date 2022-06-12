package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static WebDriver setDriver(String browserType){

        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();


        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            return null;
        }

    }

    public static void titleVerification(WebDriver driver, String expectedTitle){

        if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
            System.out.println(ANSI_GREEN_BACKGROUND + "Title Verification Test PASSED!" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED_BACKGROUND + "Title Verification Test FAILED!!!" + ANSI_RESET);
        }
    }

    public static void verifyURLStartsWith(WebDriver driver, String word){

        if(driver.getTitle().startsWith(word)){
            System.out.println(ANSI_GREEN_BACKGROUND + "URL Starts With Verification Test PASSED!" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED_BACKGROUND + "URL Starts With Verification Test FAILED!!!" + ANSI_RESET);
        }
    }

    public static void containsURLWord(WebDriver driver, String word){

        if(driver.getCurrentUrl().contains(word)){

            System.out.println(ANSI_GREEN_BACKGROUND + "URL Contains Verification Test PASSED!" + ANSI_RESET);

        }else{
            System.out.println(ANSI_RED_BACKGROUND + "URL Contains Verification Test FAILED!!!" + ANSI_RESET);
        }

    }

    public static void headerTextVerification(WebElement headerText, String expectedText){

        if(headerText.getText().equals(expectedText)){
            System.out.println(ANSI_GREEN_BACKGROUND + "Header Text Verification Test PASSED!" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED_BACKGROUND + "Header Text Verification Test FAILED!!!" + ANSI_RESET);
        }

    }

    public static void titleContains(WebDriver driver, String word){

        if(driver.getTitle().contains(word)){

            System.out.println(ANSI_GREEN_BACKGROUND + "Title Contains Verification Test PASSED!" + ANSI_RESET);

        }else{
            System.out.println(ANSI_RED_BACKGROUND + "Title Contains Verification Test FAILED!!!" + ANSI_RESET);
        }

    }

}
