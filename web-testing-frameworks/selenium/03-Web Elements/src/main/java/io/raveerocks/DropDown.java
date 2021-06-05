package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.spicejet.com/");
        Select currency = new Select(webDriver.findElement(new By.ById("ctl00_mainContent_DropDownListCurrency")));
        currency.selectByValue("USD");
        currency.selectByIndex(4);
        currency.selectByVisibleText("INR");
        webDriver.close();
    }
}
