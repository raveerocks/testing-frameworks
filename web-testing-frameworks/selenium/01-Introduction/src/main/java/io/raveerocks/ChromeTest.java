package io.raveerocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        System.out.println("Title : " +title);
        System.out.println("Current URL : "+currentUrl);

        //System.out.println("Page Source : "+pageSource);

        driver.get("https://www.yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();

        driver.close();
        //driver.quit();
    }
}
