package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static void main(String[] args)  {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://amazon.com/");
        webDriver.findElement(new By.ById("twotabsearchtextbox")).sendKeys("samsung tablets");
        webDriver.findElement(new By.ById("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver,5);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(".a-link-normal.a-text-normal")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector(".a-link-normal.a-text-normal"))).click();
        webDriver.quit();
    }
}
