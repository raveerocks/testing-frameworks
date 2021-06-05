package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActionsDemo {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.com");
        WebElement account = webDriver.findElement(new By.ById("nav-link-accountList"));
        WebElement searchBox = webDriver.findElement(new By.ById("twotabsearchtextbox"));

        Actions actions = new Actions(webDriver);

        actions.moveToElement(searchBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .keyUp(Keys.SHIFT)
                .doubleClick()
                .build()
                .perform();

        actions.moveToElement(account)
                .contextClick()
                .build()
                .perform();

     //   webDriver.quit();
    }
}
