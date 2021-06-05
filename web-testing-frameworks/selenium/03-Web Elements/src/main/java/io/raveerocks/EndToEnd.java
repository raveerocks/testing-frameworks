package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

    public static void main(String[] args) throws InterruptedException {


        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.spicejet.com/");


        webDriver.findElement(new By.ById("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        webDriver.findElement(new By.ByXPath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        webDriver.findElement(new By.ByXPath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();


        Thread.sleep(2000);
        WebElement currentDate = webDriver.findElement(new By.ByCssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));

        currentDate.click();


        webDriver.findElement(new By.ById("divpaxinfo")).click();
        Thread.sleep(2000);


        Select select = new Select(webDriver.findElement(new By.ById("ctl00_mainContent_ddl_Adult")));
        select.selectByVisibleText("6");

        webDriver.findElement(new By.ById("ctl00_mainContent_chk_friendsandfamily")).click();

        webDriver.findElement(new By.ById("ctl00_mainContent_btn_FindFlights")).click();

        Thread.sleep(2000);

        webDriver.quit();
    }
}
