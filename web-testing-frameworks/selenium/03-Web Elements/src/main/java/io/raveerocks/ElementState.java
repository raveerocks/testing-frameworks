package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.spicejet.com/");


        WebElement oneWay = webDriver.findElement(new By.ById("ctl00_mainContent_rbtnl_Trip_0"));
        WebElement roundTrip = webDriver.findElement(new By.ById("ctl00_mainContent_rbtnl_Trip_1"));
        WebElement returnDate = webDriver.findElement(new By.ById("ctl00_mainContent_view_date2"));
        WebElement returnDateStyle = webDriver.findElement(new By.ById("Div1"));


        System.out.println("Return Date Enabled: "+returnDate.isEnabled());
        System.out.println("Return Date Opacity= 1 : "+returnDateStyle.getAttribute("style").contains("1"));

        oneWay.click();
        System.out.println("Return Date Enabled: "+returnDate.isEnabled());
        System.out.println("Return Date Opacity= 1 : "+returnDateStyle.getAttribute("style").contains("1"));

        roundTrip.click();
        System.out.println("Return Date Enabled: "+returnDate.isEnabled());
        System.out.println("Return Date Opacity= 1 : "+returnDateStyle.getAttribute("style").contains("1"));


        webDriver.close();

    }
}
