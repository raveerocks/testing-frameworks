package io.raveerocks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(new By.ByCssSelector("iframe.demo-frame") ));
        WebElement draggable  = driver.findElement(new By.ById("draggable"));
        WebElement droppable  = driver.findElement(new By.ById("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,droppable).build().perform();

        driver.switchTo().defaultContent();
        driver.quit();
    }
}
