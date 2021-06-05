package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.com");
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(new By.ById("nav-link-accountList"))).build().perform();
       // webDriver.quit();
    }
}
