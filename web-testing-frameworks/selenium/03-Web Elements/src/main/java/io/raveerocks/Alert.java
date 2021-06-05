package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        webDriver.findElement(new By.ByXPath("//input[@value='Confirmation Alert']")).click();
        Thread.sleep(3000);
        System.out.println("Opened popup");
        String text = webDriver.switchTo().alert().getText();
        System.out.println(text);
        webDriver.switchTo().alert().accept();
        Thread.sleep(3000);
        System.out.println("Opened closed accept");

        webDriver.findElement(new By.ByXPath("//input[@value='Confirmation Alert']")).click();
        Thread.sleep(3000);
        System.out.println("Opened popup");
        webDriver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        System.out.println("Opened closed dismiss");

        webDriver.close();
    }
}
