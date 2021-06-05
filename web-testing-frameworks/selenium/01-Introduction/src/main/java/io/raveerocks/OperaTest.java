package io.raveerocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest {
    public static void main(String[] args) {
        WebDriver driver = new OperaDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
