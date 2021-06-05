package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Regex {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.rediff.com");
        driver.findElement(new By.ByCssSelector("a[title='Already a user? Sign in']")).click();
        driver.findElement(new By.ByXPath("//input[@id='login1']")).sendKeys("raveendra");
        driver.findElement(new By.ByCssSelector("input#password")).sendKeys("password");
       // driver.findElement(new By.ByCssSelector("input.signinbtn")).click();
        driver.findElement(new By.ByXPath("//input[contains(@name,'proceed')]")).click();
        //signinbtn

    }
}
