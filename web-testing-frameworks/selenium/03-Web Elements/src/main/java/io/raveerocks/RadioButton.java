package io.raveerocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args)  {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://echoecho.com/htmlforms10.htm");
        int group1Size = webDriver.findElements(new By.ByXPath("//input[@name='group1']")).size();
        webDriver.findElement(new By.ByXPath("//input[@value='Milk']")).click();
        System.out.println(group1Size);
        //butter.click();
    }
}
