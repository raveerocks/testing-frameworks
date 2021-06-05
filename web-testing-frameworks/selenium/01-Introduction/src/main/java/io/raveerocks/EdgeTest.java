package io.raveerocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/usr/local/drivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
