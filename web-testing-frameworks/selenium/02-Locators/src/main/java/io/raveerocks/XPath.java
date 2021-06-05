package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        /*driver.findElement(new By.ByXPath("//input[@name='email']")).sendKeys("xpathid");
        driver.findElement(new By.ByXPath("//input[@id='pass']")).sendKeys("xpathpass");
        driver.findElement(new By.ByXPath("//button[@name='login']")).click();*/


        driver.findElement(new By.ByCssSelector("input[name='email']")).sendKeys("cssid");
        driver.findElement(new By.ByCssSelector("input[id='pass']")).sendKeys("csspass");
        driver.findElement(new By.ByCssSelector("button[name='login']")).click();
    }
}
