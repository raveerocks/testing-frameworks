package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.spicejet.com/");
        for (WebElement checkBox : webDriver.findElements(new By.ByCssSelector("input[id*='ctl00_mainContent_chk']"))){
            Thread.sleep(2000);
            if(checkBox.isDisplayed()){checkBox.click();}
        }
        webDriver.close();
    }
}
