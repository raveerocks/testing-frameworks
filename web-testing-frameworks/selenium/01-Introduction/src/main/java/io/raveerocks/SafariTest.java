package io.raveerocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
