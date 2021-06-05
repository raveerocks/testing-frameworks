package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //All links on the page
        System.out.print("Total links : ");
        System.out.println(webDriver.findElements(new By.ByTagName("a")).size());


        //All links on the footer
        WebElement footerDriver =webDriver.findElement(new By.ById("gf-BIG"));
        System.out.print("Total footer links : ");
        System.out.println(footerDriver.findElements(new By.ByTagName("a")).size());


        //All links on the first column of footer
        WebElement firstColumnDriver = footerDriver.findElement(new By.ByXPath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> columnLinks = firstColumnDriver.findElements(new By.ByTagName("a"));

        System.out.print("Total footer first column links : ");
        System.out.println(columnLinks.size());

        String openInNewTab = Keys.chord(Keys.COMMAND, Keys.ENTER);

        //Open the links
        for (int i=1;i<columnLinks.size();i++){
            columnLinks.get(i).sendKeys(openInNewTab);
        }



        //Print All the titles
        Set<String> windowHandles = webDriver.getWindowHandles();
        System.out.println("Printing titles");
        System.out.println("================");
        for (String windowId : windowHandles){
            webDriver.switchTo().window(windowId);
            WebDriverWait webDriverWait = new WebDriverWait(webDriver,5);
            webDriverWait.until(timedDriver -> (!timedDriver.getTitle().isEmpty())
                    && (!timedDriver.getTitle().equalsIgnoreCase("Untitled")));
            System.out.println(webDriver.getTitle());
        }

        webDriver.switchTo().defaultContent();
        webDriver.quit();
    }
}
