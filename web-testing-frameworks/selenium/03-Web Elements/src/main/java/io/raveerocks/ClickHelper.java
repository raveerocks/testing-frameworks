package io.raveerocks;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickHelper {

    public static void safeClick(WebDriver webDriver , WebElement webElement){

        WebDriverWait webDriverWait = new WebDriverWait(webDriver,30);

        webDriverWait.until( waitDriver -> {
                    boolean result = true;
                    try{
                        System.out.println("trying to click...");
                        webElement.click();}
                    catch (ElementClickInterceptedException e){ result = false;}
                    return result; }
                    );

        System.out.println("Clicked successfully...");
    }
}
