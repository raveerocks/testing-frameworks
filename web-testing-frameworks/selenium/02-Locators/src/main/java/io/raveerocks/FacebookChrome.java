package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChrome {
    public static void main(String[] args) {
        WebDriver webDriver  = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
       // webDriver.findElement(new By.ById("email")).sendKeys("test@gmail.com");
        webDriver.findElement(new By.ByCssSelector("#email")).sendKeys("test@gmail.com");
        //webDriver.findElement(new By.ByName("pass")).sendKeys("testpass");
        webDriver.findElement(new By.ByXPath("//*[@id='pass']")).sendKeys("testpass");
        webDriver.findElement(new By.ByLinkText("Forgotten password?")).click();
        webDriver.close();
    }
}
