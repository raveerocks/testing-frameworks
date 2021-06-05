package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Windows {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(new By.ByLinkText("Terms")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentId = iterator.next();
        String childId  = iterator.next();


        System.out.println("=======================================");
        System.out.println("On Parent Window");
        System.out.println(driver.getTitle());


        System.out.println("=======================================");
        System.out.println("Switching to child Window");
        driver.switchTo().window(childId);
        WebDriverWait webDriverWait = new WebDriverWait(driver,5);
        webDriverWait.until(ExpectedConditions.titleContains("Google"));
        System.out.println(driver.getTitle());


        System.out.println("=======================================");
        System.out.println("Switching back to parent Window");
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
        System.out.println("=======================================");

        driver.quit();
    }
}
