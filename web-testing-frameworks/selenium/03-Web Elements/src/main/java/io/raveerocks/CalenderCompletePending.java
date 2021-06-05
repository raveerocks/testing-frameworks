package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderCompletePending {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        WebElement dateField = driver.findElement(new By.ByCssSelector("input[name='travel_date']"));
        ClickHelper.safeClick(driver,dateField);
        //("//div[@class='datepicker-days']//table/thead/tr/th[@class='datepicker-switch']");
        WebElement monthPicker = driver.findElement(new By.ByXPath("//div[@class='datepicker-days']//table/thead/tr/th[@class='datepicker-switch']"));
        ClickHelper.safeClick(driver,monthPicker);
       // monthPicker.click();

       // List<WebElement> dates = driver.findElements(new By.ByCssSelector("td.day"));

     /*   for (WebElement date : dates){
            System.out.println(date.getText());
        }*/

     //   driver.quit();

        // TODO : PENDING
    }
}
