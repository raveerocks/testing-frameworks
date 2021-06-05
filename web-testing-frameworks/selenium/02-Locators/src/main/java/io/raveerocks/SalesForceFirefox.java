package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForceFirefox {

    public static void main(String[] args) {
        WebDriver webDriver  = new FirefoxDriver();
        webDriver.get("https://login.salesforce.com/");
        webDriver.findElement(new By.ById("username")).sendKeys("test@gmail.com");
        webDriver.findElement(new By.ByName("pw")).sendKeys("tesspass");
        webDriver.findElement(new By.ByXPath("//*[@id='Login']")).click();
        String errorMessage = webDriver.findElement(new By.ByCssSelector("div#error.loginError")).getText();
        System.out.println(errorMessage);
        webDriver.close();
    }
}
