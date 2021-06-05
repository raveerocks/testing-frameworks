package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://amazon.com/");
        webDriver.findElement(new By.ById("twotabsearchtextbox")).sendKeys("samsung tablets");
        webDriver.findElement(new By.ById("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        webDriver.findElement(new By.ByCssSelector(".a-link-normal.a-text-normal")).click();
        webDriver.quit();
    }
}
